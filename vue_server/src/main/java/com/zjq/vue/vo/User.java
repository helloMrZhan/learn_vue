package com.zjq.vue.vo;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author zjq
 * @date 2020/6/11 19:50
 * <p>title:</p>
 * <p>description:</p>
 */
@Data
public class User {

    private Integer id;

    private String name;

    private String address;

    private Integer age;

    private LocalDate date;
}
