package com.deesite.reports;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.HashMap;
import java.util.Map;

public class ExtentManager {
    private static ExtentSparkReporter sparkReporter;
    private static ExtentReports extent;
    private static ExtentTest parentTest;
    private static ExtentTest childTest;
    private static ExtentTest grandChildTest;
    private static String extentReportPath = "./extentReport.html";
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();

    public static ExtentSparkReporter getSparkReporter(){
        sparkReporter = new ExtentSparkReporter(extentReportPath);
        sparkReporter.config().setDocumentTitle("Appium Framework");
        sparkReporter.config().setReportName("MyApp");
        sparkReporter.config().setTheme(Theme.DARK);
        return sparkReporter;
    }

    public static ExtentReports getExtentReports() {
        if (extent != null) {
            System.out.println("********* - Using Extent Reports - *********");
            return extent;
        } else {
            System.out.println("********* - Initializing Extent Report - *********");
            extent = new ExtentReports();
            extent.attachReporter(getSparkReporter());
            extent.setSystemInfo("Host", "Dee");
            extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
            return extent;
        }
    }

    public static synchronized ExtentTest getTest() {
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized ExtentTest getParentTest(String testName) {
        parentTest = getExtentReports().createTest(testName);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), parentTest);
        return parentTest;
    }

    public static synchronized ExtentTest getChildTest(String testName) {
        childTest = getExtentReports().createTest(testName);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), childTest);
        return childTest;
    }

    public static synchronized ExtentTest getGrandChildTest(String testName) {
        grandChildTest = getExtentReports().createTest(testName);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), grandChildTest);
        return grandChildTest;
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = getExtentReports().createTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }


}
