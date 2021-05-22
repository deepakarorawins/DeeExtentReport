package com.deesite.listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.deesite.reports.ExtentManager;
import org.testng.*;

public class DeeListeners implements ITestListener, ISuiteListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("*******On Test Start*******");

        //ExtentManager.getChildTest(result.getMethod().getMethodName());
        //ExtentTest childTest = parentTest.createNode(result.getMethod().getMethodName(), result.getMethod().getDescription());
        //ExtentTest grandChildTest = childTest.createNode(result.getMethod().getMethodName(), result.getMethod().getDescription());
        //ExtentManager.startTest(result.getMethod().getMethodName(), result.getMethod().getDescription());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentManager.getTest().log(Status.PASS, "Passed: "+result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Override
    public void onStart(ISuite suite) {
        //ExtentTest parentTest = ExtentManager.getParentTest(suite.getName());
    }
}
