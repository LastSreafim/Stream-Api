package com.sreams_homework.learning_Streams_Api.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongFormatException extends RuntimeException {
    public WrongFormatException(String message) {
        super(message);
    }
}
