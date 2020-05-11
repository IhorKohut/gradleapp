package com.example.tests;

import org.testng.annotations.Test;

public class TestWithSetupTeardown {

    @Test
    public void setUp() {
        System.out.println("setUp");
    }

    @Test
    public void tearUp() {
        System.out.println("tearUp");
    }
}