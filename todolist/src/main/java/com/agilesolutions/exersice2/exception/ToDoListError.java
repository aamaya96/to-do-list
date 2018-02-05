package com.agilesolutions.exersice2.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDoListError {

    private HttpStatus status;
    private String timestamp;
    private String message;
    private String debugMessage;
    private String path;

    public ToDoListError(HttpStatus status, String message, String path, Throwable ex) {
       this.status = status;
       this.message = message;
       this.debugMessage = ex.getLocalizedMessage();
       this.path = path;
       this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
    }

    public String getPath() {
       return path;
    }

    public void setPath(String path) {
       this.path = path;
    }

    public HttpStatus getStatus() {
       return status;
    }

    public void setStatus(HttpStatus status) {
       this.status = status;
    }

    public String getTimestamp() {
       return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
       this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
       this.message = message;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }
}