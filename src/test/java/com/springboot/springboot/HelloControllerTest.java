package com.springboot.springboot;

import org.junit.Test;

/**
 * 描述：HelloController测试
 *
 * @author Pearl . Li
 * @create 2018-08-09 13:57
 */
public class HelloControllerTest{
    @Test
public  void syaHello(){
        HelloController helloController=new HelloController();
        System.out.println(helloController.hello());
//    System.out.println("aaaaa");
}
}
