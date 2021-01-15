package com.hayrettinm.carstorecarsrv.web.controller;

import com.hayrettinm.carstorecarsrv.web.model.CarDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/car")
@RestController
public class CarController {

    @GetMapping("/{carId}")
    public ResponseEntity<CarDto> getCarById(@PathVariable("carId") UUID carId){
        //TODO: real impl soon
        return new ResponseEntity<>(CarDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewCar(@RequestBody CarDto carDto){
        //TODO: real impl soon
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{carId}")
    public ResponseEntity updateByCarId(@PathVariable("carId") UUID carId, @RequestBody CarDto carDto){
        //TODO: real impl soon
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
