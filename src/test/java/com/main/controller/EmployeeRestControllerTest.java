package com.main.controller;

import com.main.service.EmployeeService;
import com.main.util.EmployeeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeRestController.class)
public class EmployeeRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;


    @Test
    public void retrieveDetailsForCourse() throws Exception {

        Mockito.when(employeeService.getAllEmployee()).thenReturn(EmployeeUtils.getAllEmployee());

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employeeAllList").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        System.out.println("Out put : " + result.getResponse().getContentAsString());
        String expected = "[{\"id\":1,\"lastName\":\"Davolio\",\"firstName\":\"Nancy\",\"salary\":3500,\"department\":\"Marketing\"},{\"id\":2,\"lastName\":\"Fuller\",\"firstName\":\"Andrew\",\"salary\":2500,\"department\":\"Sales\"},{\"id\":3,\"lastName\":\"Leverling\",\"firstName\":\"Janet\",\"salary\":2500,\"department\":\"Sales\"},{\"id\":4,\"lastName\":\"Peacock\",\"firstName\":\"Margaret\",\"salary\":5500,\"department\":\"Marketing\"},{\"id\":5,\"lastName\":\"Buchanan\",\"firstName\":\"Steven\",\"salary\":7500,\"department\":\"Admin\"},{\"id\":6,\"lastName\":\"Suyama\",\"firstName\":\"Michael\",\"salary\":6000,\"department\":\"Maintenance\"}]";

        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), true);
    }


}
