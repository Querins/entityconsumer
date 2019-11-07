package com.example.kafkaconsumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users", type = "user")
public class User {

    @Id
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private int age;

    public User() { }

    public User(int id, String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}