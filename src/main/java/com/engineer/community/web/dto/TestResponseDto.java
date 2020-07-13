package com.engineer.community.web.dto;

public class TestResponseDto {

    private final String name;
    private final int tel;

    public TestResponseDto(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public int getTel() {
        return tel;
    }
}
