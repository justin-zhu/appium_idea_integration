package com.justin.listener;

import com.justin.appium.ReTry;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReRun implements IAnnotationTransformer {
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
       IRetryAnalyzer IRetryAnalyzer= iTestAnnotation.getRetryAnalyzer();
       if (IRetryAnalyzer==null)
       {
           iTestAnnotation.setRetryAnalyzer(ReTry.class);
       }

    }
}
