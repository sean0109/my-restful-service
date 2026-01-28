package io.github.skywlkr.myrestfulservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private Date joinDate;

    public User(int id, String name, Date joinDate) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;

    }
}
