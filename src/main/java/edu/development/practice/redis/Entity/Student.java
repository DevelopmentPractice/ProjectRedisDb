package edu.development.practice.redis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@RedisHash("Estudiante")
public class Student implements Serializable {

    public enum Gender {
        MALE, FEMALE
    }

    private String id;

    private String name;

    private Gender gender;

    private Integer grade;

}
