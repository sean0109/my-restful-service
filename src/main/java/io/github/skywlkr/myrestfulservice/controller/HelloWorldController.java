package io.github.skywlkr.myrestfulservice.controller;

import io.github.skywlkr.myrestfulservice.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping("/hello-world-bean/{name}")
    public HelloWorldBean helloWordBean(@PathVariable String name) {
        System.out.println("test : " +name);
        return null;
    }
}
