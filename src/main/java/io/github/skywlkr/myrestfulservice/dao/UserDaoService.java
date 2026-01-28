package io.github.skywlkr.myrestfulservice.dao;

import io.github.skywlkr.myrestfulservice.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "Mike", new Date()));
        users.add(new User(2, "Jack", new Date()));
        users.add(new User(3, "Hellen", new Date()));
        users.add(new User(4, "May", new Date()));
        users.add(new User(5, "David", new Date()));
    }

    // 전체 회원 조회
    public List<User> getUsers() {
        return users;
    }

    // 회원 저장
    public User save(User user) {

        if (user.getId() == null) {
            user.setId(userCount++);
        }

        if (user.getJoinDate() == null) {
            user.setJoinDate(new Date());
        }

        if(user.getUserName() == null) {
            user.setUserName("테스트");
        }

        users.add(user);
        return user;
    }

    // 아이디로 회원 찾기
    public User findById(Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}
