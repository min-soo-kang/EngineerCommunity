package com.engineer.community.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestResponseDtoTest {
    @Test
    public void 다오_테스트() {
        //given
        String name = "김윤성";
        int tel = 112;

        //when
        TestResponseDto dto = new TestResponseDto(name, tel);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getTel()).isEqualTo(tel);
    }
}
