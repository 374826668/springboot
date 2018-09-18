package com.springboot.springboot.restController;

import com.springboot.springboot.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello() {
        return port;
//        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "/get")
    public Map<String, String> get(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("value", "hello");
        return map;
    }

    @RequestMapping(value = "/find/{id}/{name}")
    public User find(@PathVariable int id, @PathVariable String name) {
        User u = new User();
        u.setId(id);
        u.setName(name);
        u.setDate(new Date());
        return u;
    }

}
