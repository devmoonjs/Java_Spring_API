package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // null이 허용될 때는 I 대문자로 사용

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
