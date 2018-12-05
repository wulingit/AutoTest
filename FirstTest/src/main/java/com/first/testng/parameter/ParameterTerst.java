package com.first.testng.parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTerst {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, int age){
        System.out.println("");
        System.out.println("name = "+ name + "   age = "+ age);
    }
}
