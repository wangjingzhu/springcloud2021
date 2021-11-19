package com.test.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResule<T> {

    private Integer code;


    private String message;

    private T data;

    public CommonResule(Integer code, String message){
        this(code, message, null);
    }
}
