package com.deesite.reports.usingThreadLocal;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManagerThreadLocal {
    private static ExtentSparkReporter sparkReporter;
    private static ExtentReports extent;
    private static String extentReportPath = "./extentReport.html";

    public static ExtentSparkReporter getSparkReporter() {
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
}
