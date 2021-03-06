package com.sda.database.impl;

import com.google.common.collect.ImmutableMap;
import com.sda.database.api.IUser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class DatabaseData {

    private static final IUser ROOT = new User("root", "root@linux.com", "root");
    private static final IUser GIGEL = new User("gigel", "gigel@yahoo.com", "123qweASD!");
    private static final IUser DOREL = new User("dorel", "dorel@linux.com", "dorel99");
    private static final IUser GUEST = new User("guest", "guest@windows.com", "guestUser");
    private static final IUser THOR = new User("thor", "thor@asgard.as", "Mjolnir");


    static Map<String, IUser> buildDatabase() {
        Map<String, IUser> users = new HashMap<>();
        users.put(ROOT.getId(), ROOT);
        users.put(GIGEL.getId(), GIGEL);
        users.put(DOREL.getId(), DOREL);
        users.put(GUEST.getId(), GUEST);
        users.put(THOR.getId(), THOR);
        return users;
    }

    //TODO - by using this method demonstrate streams
    static List<IUser> getUserList() {
        List<IUser> result = new LinkedList<>();

        //TODO - explain why this works
        //TODO - demonstrate construction with parameterized constructor
        //(alt + enter on warning)
        result.addAll(buildDatabase().values());

        return result;
    }
}
