package com.exa.timezone.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;

class DateServiceTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DateService dateService;
    @Autowired
    private ObjectMapper objectMapper;

    private String fechaCorrecta;

    @BeforeEach
    void setUp() {
        fechaCorrecta = DateService.obtenerFechaHora();
    }

    @Test
    void obtenerFechaHora_isok_test() throws Exception {

        assertThat(DateService.obtenerFechaHora().compareToIgnoreCase(fechaCorrecta)).isOne();

    }
}