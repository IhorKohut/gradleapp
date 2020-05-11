package com.example.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithDataProvider {
    @DataProvider(name = "Country")
    public Object[][] createData1() {
        return new Object[][] {
                { "Ukraine", "Kiev"}
        };
    }

    @Test(dataProvider = "Country")
    public void verifyData1(String country, String capital) {
        System.out.println(capital + " is the capital of " + country);
    }

}
