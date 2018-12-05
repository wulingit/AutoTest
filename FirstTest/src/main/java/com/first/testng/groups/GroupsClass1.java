package com.first.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu" )
public class GroupsClass1 {

    public void stu1(){
        System.out.println("GroupsClass1   stu111111111111运行");
    }

    public void stu2(){
        System.out.println("GroupsClass1  stu222222运行");
    }
}
