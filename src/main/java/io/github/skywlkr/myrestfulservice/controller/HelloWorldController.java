package io.github.skywlkr.myrestfulservice.controller;

import io.github.skywlkr.myrestfulservice.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController// ResponseBody 어노테이션이 불필요 하다.
public class HelloWorldController {

    // GET
    // URI - /hello-world
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world")

    @GetMapping(path = "/hello-world")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    // @ResponseBody
    private HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World! %s", name));
    }

}

