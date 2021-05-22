package com.deesite;

import com.aventstack.extentreports.Status;
import com.deesite.reports.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class DemoTest1 extends BaseTest{


    @Test
    public void test1(){
        //ExtentManager.getTest().info("ExtentManager");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test1: "+"Step1");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test1: "+"Step2");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test1: "+"Step3");
    }

    @Test
    public void test2(){
        //ExtentManager.getTest().info("ExtentManager");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test2: "+"Step1");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test2: "+"Step2");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test2: "+"Step3");
    }

    @Test
    public void test3(){
        //ExtentManager.getTest().info("ExtentManager");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test3: "+"Step1");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test3: "+"Step2");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest1: Method Test3: "+"Step3");
    }

}
