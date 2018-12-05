package com.first.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注释，用来把方法标记为测试的一部分
    @Test
    public  void  testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("testCase1这是测试用例1");
    }

    @Test
    public  void  testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("test2这是测试用例2");
    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("beforMethod这是在测试开始之前运行的方法");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod是在测试运行之后运行的方法");
    }

    @BeforeClass
    public  void  beforeClass(){
        System.out.println("beforeClass是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}

