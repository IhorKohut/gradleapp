package com.example.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @Parameters({"country", "capital"})
    @Test
    public void parameterTest(String country, String capital){
        System.out.println(capital + " is the capital of " + country);
    }
}