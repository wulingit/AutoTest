package com.first.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsClass2 {

    public void  stu1(){
        System.out.println("GroupsClass2 stu11111yu运行");
    }

    public void  stu2(){
        System.out.println("GroupsClass2 stu222221yu运行");
    }
}
