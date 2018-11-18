package com.justin.appium;

import org.testng.annotations.Test;

public class First {
    @Test
    public void testName() {
        System.out.println("first........");
        int i=10/0;
        System.out.println(i);
    }
}
