package com.hayrettinm.carstorecarsrv.web.mapper;

import com.hayrettinm.carstorecarsrv.domain.Car;
import com.hayrettinm.carstorecarsrv.web.model.CarDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface CarMapper {

    CarDto carToCarDto(Car car);

    Car carDtoToCar(CarDto carDto);
}
