package com.hayrettinm.carstorecarsrv.repository;

import com.hayrettinm.carstorecarsrv.domain.Car;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CarRepository extends PagingAndSortingRepository<Car, UUID> {
}
