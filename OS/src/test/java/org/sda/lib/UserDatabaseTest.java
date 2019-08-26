package org.sda.lib;

import org.junit.Test;
import org.sda.api.IUser;
import org.sda.impl.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserDatabaseTest {

    private static List<String> testPassword = new ArrayList<>();

    @Test
    public void getPasswords() {
        testPassword.add("root");
        testPassword.add("123qweASD!");
        testPassword.add("student");
        assertEquals(testPassword, UserDatabase.getPasswords());
    }

    private IUser root = new User("root", "root");
    private IUser admin = new User("admin", "123qwerty");
    private IUser student = new User("Bob", "theBo$$");

    @Test
    public void validate1() {
        assertTrue(UserDatabase.validate(root.getUsername(), root.getPassword().getKey()));
    }

    @Test
    public void validate2() {
        assertTrue(UserDatabase.validate(admin.getUsername(), admin.getPassword().getKey()));
    }

    @Test
    public void validate3() {
        assertFalse(UserDatabase.validate(student.getUsername(), student.getPassword().getKey()));
    }
}