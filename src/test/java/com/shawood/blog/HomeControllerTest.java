package com.shawood.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
//    注入MockMvc

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/"))
//                期望得到 HTTP200
                .andExpect(status().isOk())
//                期望得到 home 视图
                .andExpect(view().name("home"))
//                渲染后视图应该包含文本 "Welcome to ..."
                .andExpect(content().string(
                        containsString("Welcome to Shawood's homepage")
                ));

    }
}
