package com.sreams_homework.learning_Streams_Api.Exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeAlreadyAddedException extends RuntimeException {
}