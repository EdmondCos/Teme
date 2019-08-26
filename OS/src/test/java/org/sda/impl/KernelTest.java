package org.sda.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class KernelTest {
    private Kernel kernel = new Kernel();

    @Test
    public void startUp() {
        kernel.startUp();
        assertTrue(kernel.isStarted());
        System.out.println();
    }


    @Test
    public void shutDown() {
        kernel.startUp();
        kernel.shutDown();
        assertTrue(kernel.isStarted());
        System.out.println();
    }

    @Test
    public void loginShutdown() {
        assertEquals("", kernel.login("what", "ever"));
        System.out.println();
    }

    @Test
    public void alreadyLogged() {
        kernel.startUp();
        kernel.login("student", "student");
        assertEquals("Login failed. User 'student' is already logged in.",
                kernel.login("student", "ever"));
        System.out.println();
    }

    @Test
    public void loginActual() {
        String user = "root";
        kernel.startUp();
        assertEquals("Login failed for '" + user + "'",
                kernel.login(user, "abc"));
        System.out.println();
    }

    @Test
    public void logout() {
        kernel.startUp();
        kernel.login("root", "root");
        assertEquals("Logging out user 'root'!", kernel.logout());
        System.out.println();
    }
}