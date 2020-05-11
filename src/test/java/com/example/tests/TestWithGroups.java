package com.example.tests;

import org.testng.annotations.Test;

public class TestWithGroups {

    @Test(groups="dependency")
    public void installApp(){
        System.out.println("First TC with dependency");
    }
    @Test(groups="setup/teardown")
    public void setupTeardownTest(){
        System.out.println("Second TC with setup/teardown");
    }
    @Test(enabled = false)
    public void checkCityTest(){
        System.out.println("Third TC excluded");
    }
}