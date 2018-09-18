package com.springboot.springboot;

import com.springboot.springboot.restController.SpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述：HelloController测试
 *
 * @author Pearl . Li
 * @create 2018-08-09 13:57
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class HelloControllerTest {

    @Test
    public void syaHello() {
        System.out.println("aaaaa");
    }
}
