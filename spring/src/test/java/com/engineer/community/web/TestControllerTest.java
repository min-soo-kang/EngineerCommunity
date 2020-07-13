package com.engineer.community.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest
public class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void Test가_리턴된다() throws Exception {
        String test = "test";

        mvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(test));

    }

    @Test
    public void testDto가_리턴된다() throws Exception {
        String name = "김윤성";
        int tel = 112;

        mvc.perform(get("/test/dto")
                .param("name", name)
                .param("tel", String.valueOf(tel)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.tel", is(tel)));
    }
}
