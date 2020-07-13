package com.engineer.community.web;

import com.engineer.community.web.dto.TestResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test/dto")
    public TestResponseDto testDto(@RequestParam("name") String name,
                                   @RequestParam("tel") int tel ) {
        return new TestResponseDto(name, tel);
    }

}
