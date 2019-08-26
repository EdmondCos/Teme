package com.sda.form.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sda.database.impl.User;
import jdk.nashorn.internal.runtime.options.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sda.database.api.IDatabaseAccess;
import com.sda.database.api.IUser;
import com.sda.database.impl.Database;
import com.sda.form.api.IForm;
import com.sda.form.api.IGreetingService;

import static java.util.Optional.ofNullable;

public class Form implements IForm {

    private static final Logger LOGGER = LoggerFactory.getLogger(Form.class);
    private IDatabaseAccess databaseConnection;
    private IGreetingService greetingService = user -> LOGGER.info("Hello, {}", user.getName());

    public Form() {
        databaseConnection = new Database();
    }


    @Override
    public void registerUser(IUser newUser) {
        LOGGER.debug("Registering a new user, with id '{}'", newUser.getId());
        Optional<IUser> uniqueId = databaseConnection.getById(newUser.getId());
        if (!uniqueId.isPresent()) {
            if (isValidated(newUser)) {
                databaseConnection.save(newUser);
            }
        } else {
            LOGGER.error("Email already registered");
        }
    }

    private boolean isValidated(IUser newUser) {
        if (newUser.getId() == null || newUser.getId().equals("")) {
            LOGGER.error("The email provided is empty");
            return false;
        } else if (newUser.getPassword() == null || newUser.getPassword().length == 0) {
            LOGGER.error("The password provided is empty");
            return false;
        }
        List<String> names = databaseConnection.getAll().stream().
                map(IUser::getName).
                filter(name -> name.equals(newUser.getName())).
                collect(Collectors.toList());
        if (!names.isEmpty()) {
            LOGGER.error("Name already registered");
            return false;
        }
        return true;
    }

    @Override
    public boolean login(String email, String password) {
        LOGGER.debug("Attempting login for user '{}'", email);
        boolean result = false;
        Optional<IUser> foundUser = databaseConnection.getById(email);

        boolean passwordsMatch = false;
        if (foundUser.isPresent()) {
            passwordsMatch = Arrays.equals(foundUser.get().getPassword(),
                    password.toCharArray());
        } else {
            LOGGER.error("User with id '{}' was not found", email);
        }

        if (passwordsMatch) {
            result = true;
            greetingService.greet(foundUser.get());
            // Greeting greeting = new Greeting();
            // greeting.greet(foundUser);
        } else {
            LOGGER.error("Password incorrect for user '{}'", email);
        }

        return result;
    }
}
