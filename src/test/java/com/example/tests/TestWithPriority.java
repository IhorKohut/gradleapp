package com.example.tests;

import org.testng.annotations.Test;

public class TestWithPriority {
    @Test(priority=3)
    public void test1(){
        System.out.println("Third");
    }
    @Test(priority=2)
    public void test2(){
        System.out.println("Second");
    }
    @Test(priority=1)
    public void test3() {
        System.out.println("First");
    }
}