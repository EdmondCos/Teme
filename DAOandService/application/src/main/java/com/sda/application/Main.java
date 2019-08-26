package com.sda.application;

import com.sda.database.api.IUser;
import com.sda.database.impl.User;
import com.sda.form.api.IForm;
import com.sda.form.impl.Form;

public class Main {

    public static void main(String[] args) {
        IForm form = new Form();

//        form.login("thor@asgard.as", "Mjolnir");
//        form.login("", "");

        IUser goodBob = new User("Bobitza", "bob@bob.bob", "idol");
        IUser badLoki = new User("RealThor", "thor@asgard.as", "punyGod");
        IUser emptyTest = new User("thor", "a@a", "123");

//        form.registerUser(emptyTest);
        form.registerUser(goodBob);
        System.out.println();
        form.registerUser(badLoki);

        
        //TODO - create test for database access and cover all functionalities (TEMA 8.06)
    }
}
