package com.deesite.reports.usingThreadLocal;

import com.aventstack.extentreports.ExtentTest;

public class ExtentFactory {
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    private ExtentFactory() {
    }

    private static ExtentFactory instance = new ExtentFactory();

    public static ExtentFactory getInstance() {
        return instance;
    }

    public ExtentTest getExtent() {
        return extentTest.get();
    }

    public void setExtent(ExtentTest extentTest) {
        this.extentTest.set(extentTest);
    }

    public void removeExtentObject() {
        extentTest.remove();
    }
}
