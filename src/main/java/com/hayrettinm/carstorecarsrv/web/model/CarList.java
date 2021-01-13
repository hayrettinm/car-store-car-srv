package com.hayrettinm.carstorecarsrv.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CarList extends PageImpl<CarDto> {
    public CarList(List<CarDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public CarList(List<CarDto> content) {
        super(content);
    }
}
