package com.justin.appium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTry  implements IRetryAnalyzer {
    int reCount = 3;
    int index = 1;
    public boolean retry(ITestResult iTestResult) {
        if(reCount>index)
        {
            index++;
            return  true;
        }
        return false;
    }
}
