package com.example.scorp_gym_app;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterTest {
    @Test
    public void TestUserRegistration() {
        MainActivity email = new MainActivity();
        email.setEmail("john@email.com");

        assertEquals("john@email.com", email.getEmail());

        /* Test hashPasswordMethod
           Test if the email exist already in the database
           Test invalid inputs for both passwords and email
         */
    }
}
