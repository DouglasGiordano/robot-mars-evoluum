package br.com.evoluum.giordano.robotevoluum;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.util.AssertionErrors;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RobotControlTest extends SuperControlTest{
    @Test
    @Order(1)
    public void getTestMMRMMRMM() throws Exception {
        String url = "/rest/mars/MMRMMRMM";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();

        String content = result.getResponse().getContentAsString();
        AssertionErrors.assertEquals("Test MMRMMRMM", "(2, 0, S)", content);
    }

    @Test
    @Order(2)
    public void getTestMML() throws Exception {
        String url = "/rest/mars/MML";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();

        String content = result.getResponse().getContentAsString();
        AssertionErrors.assertEquals("Test MML", "(0, 2, W)", content);
    }

    @Test
    @Order(3)
    public void getTestMMLTwo() throws Exception {
        String url = "/rest/mars/MML";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();

        String content = result.getResponse().getContentAsString();
        AssertionErrors.assertEquals("Test MML Two", "(0, 2, W)", content);
    }

    @Test
    @Order(4)
    public void getTestAAA() throws Exception {
        String url = "/rest/mars/AAA";
        mvc.perform(
                MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest());
    }

    @Test
    @Order(5)
    public void getTestTwoFourM() throws Exception {
        String url = "/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM";
        mvc.perform(
                MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest());
    }
}
