package io.github.skywlkr.myrestfulservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)   // 500 error 가 아닌, 404 not found 를 리턴한다.
public class UserNotFoundException extends RuntimeException {

    private final Integer id;

    public UserNotFoundException(String message, Integer id) {
        super(message);
        this.id = id;
    }
}
