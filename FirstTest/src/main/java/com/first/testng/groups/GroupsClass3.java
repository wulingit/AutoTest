package com.first.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsClass3 {

    public void teacher1(){
        System.out.println("GroupsClass3  teacher11111运行");
    }

    public void teacher2(){
        System.out.println("GroupsClass3  teacher222222222运行");
    }
}
