package com.sda.form.impl;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginTest {
    private Form form = new Form();

    @Test
    public void testUserNotFound() {
        assertFalse(form.login("thor@eu.ro", "root"));
    }

    @Test
    public void testWrongPassword() {
        assertFalse(form.login("thor@asgard.as", "asgard"));
    }

    @Test
    public void testLoginSuccess() {
        assertTrue(form.login("root@linux.com", "root"));
    }
}