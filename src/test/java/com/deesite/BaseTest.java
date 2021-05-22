package com.deesite;

import com.deesite.reports.ExtentManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite(){
        ExtentManager.getParentTest("iPhone 8");

    }

    @BeforeClass
    public void beforeClass(){
        ExtentManager.getChildTest("class name");
    }

    @AfterMethod
    public void afterMethod(){
        ExtentManager.getExtentReports().flush();
    }

}
