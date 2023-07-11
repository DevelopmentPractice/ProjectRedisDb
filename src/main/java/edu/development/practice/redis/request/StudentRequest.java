package edu.development.practice.redis.request;

import lombok.Data;

@Data
public class StudentRequest {

    private String id;

    private String name;

    private String gender;

    private Integer grade;

}
