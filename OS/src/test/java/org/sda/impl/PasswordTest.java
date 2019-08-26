package org.sda.impl;

import org.junit.Test;
import org.sda.impl.Password;

import static org.junit.Assert.assertEquals;

public class PasswordTest {

    @Test
    public void testPasswordConstructor() {
        Password password = new Password("Pitong");
        assertEquals("Pitong", password.getKey());
    }

}