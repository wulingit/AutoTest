package com.first.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsONMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组测试方法11111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组测试方法222222");
    }

    @Test(groups ="client")
    public void test3(){
        System.out.println("这是客户端组的方法333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组方法4444444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法！");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！");
    }
}
