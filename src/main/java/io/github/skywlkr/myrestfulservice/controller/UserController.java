package io.github.skywlkr.myrestfulservice.controller;

import io.github.skywlkr.myrestfulservice.bean.User;
import io.github.skywlkr.myrestfulservice.dao.UserDaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Integer id) {
        return userDaoService.findById(id);
    }

    // 회원 저장
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {

        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest() // 현재 리퀘스트 정보로 부터 생성
                .path("/{id}")  // 현재 요청된 경로 /users 뒤에 /id 값을 붙인다
                .buildAndExpand(savedUser.getId())  // 이 아디이 값을 어디서 가져 오느냐.
                .toUri();

        return ResponseEntity.created(location).build();
        // created 메서드로 인해 201 상태 코드를 세팅
        // ResponseEntity.status(HttpStatus.CREATED) 와 같은 의미
    }
}
