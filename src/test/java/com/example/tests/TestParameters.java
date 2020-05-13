package com.example.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// This test should run from testng.xml

public class TestParameters {
    @Parameters({"country", "capital"})
    @Test
    public void parameterTest(String country, String capital){
        System.out.println("Test with Parameters");
        System.out.println(capital + " is the capital of " + country);
    }
    @DataProvider(name = "Country")
    public Object[][] createData1() {
        return new Object[][] {
                { "Ukraine", "Kiev"}
        };
    }

    @Test(dataProvider = "Country")
    public void verifyData1(String country, String capital) {
        System.out.println("Test with data Provider");
        System.out.println(capital + " is the capital of " + country);
    }
}