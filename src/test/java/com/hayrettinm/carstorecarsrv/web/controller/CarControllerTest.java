package com.hayrettinm.carstorecarsrv.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hayrettinm.carstorecarsrv.web.model.CarDto;
import com.hayrettinm.carstorecarsrv.web.model.CarModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(CarController.class)
class CarControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    private static final String URL = "/api/v1/car/";

    @Test
    void getCarById() throws Exception {
        mockMvc.perform(get(URL + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void saveNewCar() throws Exception {

        CarDto carDto = getValidCarDto();
        String carDtoJson = objectMapper.writeValueAsString(carDto);

        mockMvc.perform(post(URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(carDtoJson)
        ).andExpect(status().isCreated());

    }

    @Test
    void updateByCarId() throws Exception{

        CarDto carDto = getValidCarDto();
        String carDtoJson = objectMapper.writeValueAsString(carDto);

        mockMvc.perform(put(URL + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(carDtoJson)
        ).andExpect(status().isNoContent());
    }

    CarDto getValidCarDto(){
        return CarDto.builder()
                .carModel(CarModel.SPORTS)
                .name("New Car")
                .price(new BigDecimal("235000"))
                .chasisNo(123L)
                .build();
    }
}