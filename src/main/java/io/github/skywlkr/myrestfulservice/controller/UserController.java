package io.github.skywlkr.myrestfulservice.controller;

import io.github.skywlkr.myrestfulservice.bean.User;
import io.github.skywlkr.myrestfulservice.dao.UserDaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    // DI
    private final UserDaoService userDaoService;

    // 모든 회원 찾기
    @GetMapping("/users")
    public List<User> findAll() {
        return userDaoService.getUsers();
    }

    // 회원 아이디로 회원 찾기
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
        return userDaoService.findById(id);
    }



}
