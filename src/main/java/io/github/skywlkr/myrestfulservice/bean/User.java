package io.github.skywlkr.myrestfulservice.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String userName;
    private Date joinDate;

}
