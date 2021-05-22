package com.deesite;

import com.aventstack.extentreports.Status;
import com.deesite.reports.ExtentManager;
import org.testng.annotations.Test;

public class DemoTest2 {


    @Test
    public void test1(){
        //ExtentManager.getTest().info("ExtentManager");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test1: "+"Step1");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test1: "+"Step2");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test1: "+"Step3");
    }

    @Test
    public void test2(){
        //ExtentManager.getTest().info("ExtentManager");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test2: "+"Step1");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test2: "+"Step2");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test2: "+"Step3");
    }

    @Test
    public void test3(){
        //ExtentManager.getTest().info("ExtentManager");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test3: "+"Step1");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test3: "+"Step2");
        ExtentManager.getTest().log(Status.INFO, "Class DemoTest2: Method Test3: "+"Step3");
    }

}
