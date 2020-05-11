package com.example.tests;

import org.testng.annotations.Test;

public class TestWithDependency {

    @Test
    public void installApp(){
        System.out.println("App is installed");
    }
    @Test(dependsOnMethods = {"installApp"})
    public void uninstallApp(){
        System.out.println("App is uninstalled");
    }
}