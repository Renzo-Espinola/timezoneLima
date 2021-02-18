package com.exa.timezone.controller;
import static org.mockito.BDDMockito.given;
import com.exa.timezone.service.DateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = TestController.class)
class TestControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DateService dateService;
    @Autowired
    private ObjectMapper objectMapper;

    private String fechaCorrecta;

    @BeforeEach
    void setUp() {
        fechaCorrecta = dateService.toString();
    }

    @Test
    void getTime_isok_test() throws Exception {
        given(DateService.obtenerFechaHora()).willReturn(fechaCorrecta);
        this.mockMvc.perform(get("/Gettime"))
                .andExpect(status().isOk());
    }
}