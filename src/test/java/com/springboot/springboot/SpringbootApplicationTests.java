package com.springboot.springboot;

import com.springboot.springboot.restController.SpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class SpringbootApplicationTests {

    @Value("${server.port}")
    private String port;

    @Test
    public void contextLoads() {
        System.out.println(port);
    }

}
