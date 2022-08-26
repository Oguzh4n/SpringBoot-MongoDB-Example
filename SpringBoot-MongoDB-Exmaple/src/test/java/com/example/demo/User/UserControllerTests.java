package com.example.demo.User;

import com.example.demo.Controller.UserController;
import com.example.demo.Model.AccountType;
import com.example.demo.Model.Address;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
public class UserControllerTests {
    private static final String TEST_USER_ID = "1";
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    private User testUser() {
        Address testAddress = new Address(
                "Musterstrasse 10",
                "12345",
                "Musterstadt"
        );
        User testUser = new User();
        testUser.setId(TEST_USER_ID);
        testUser.setEmail("maxmustermann@hotmail.com");
        testUser.setName("Max");
        testUser.setSurname("Mustermann");
        testUser.setAddress(testAddress);
        testUser.setAccountType(AccountType.PREMIUM);
        return testUser;
    }

    //Mock UserService Class
    @BeforeEach
    void setup() {
        User user = testUser();
        when(this.userService.getUsersByName("Max")).thenReturn(Lists.newArrayList(user));
    }

    //Test UserController function "getUsers"
    @Test
    void testGetUsers() throws Exception {
        ObjectMapper objectWriter = null;
        mockMvc.perform(get("/user?name=Max"))
                .andExpect(status().is(302))
                .andExpect(jsonPath("$[0].id", is(TEST_USER_ID)));
    }
}
