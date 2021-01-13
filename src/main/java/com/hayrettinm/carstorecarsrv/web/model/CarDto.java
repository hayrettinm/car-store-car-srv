package com.hayrettinm.carstorecarsrv.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDto {

    private UUID id;

    private Long chasisNo;
    private BigDecimal price;
    private CarModel carModel;

    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
}
