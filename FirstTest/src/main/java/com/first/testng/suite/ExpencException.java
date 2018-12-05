package com.first.testng.suite;

import org.testng.annotations.Test;

/**
 * 我们期望结果为某一个异常的时候，
 * 比如：我们输入一个错误参数，服务器会报错
 * 也就是说我们的预期的结果就是异常
 */
public class ExpencException {

    //这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
