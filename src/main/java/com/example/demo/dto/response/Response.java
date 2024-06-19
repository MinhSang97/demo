package com.example.demo.dto.response;

import java.io.Serializable;

public class Response implements Serializable {
    private Integer status;
    private String message;
    private String data;

    public Response(Integer status, String message, String data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }
}
