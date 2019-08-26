package org.sda.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUserConstructor() {
        User user = new User("Barbut", "Parola");
        assertEquals("Barbut", user.getUsername());
        assertEquals("Parola", user.getPassword().getKey());
    }

}