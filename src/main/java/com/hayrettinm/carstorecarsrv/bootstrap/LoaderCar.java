package com.hayrettinm.carstorecarsrv.bootstrap;

import com.hayrettinm.carstorecarsrv.domain.Car;
import com.hayrettinm.carstorecarsrv.repository.CarRepository;
import com.hayrettinm.carstorecarsrv.web.model.CarModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class LoaderCar implements CommandLineRunner {

    private final CarRepository carRepository;

    public LoaderCar(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCarObjects();
    }

    private void loadCarObjects() {
        if (carRepository.count() == 0) {
            carRepository.save(Car.builder()
                    .id(UUID.randomUUID())
                    .carModel("SEDAN")
                    .name("Megane")
                    .orderQuantity(20)
                    .chasisNo(654321L)
                    .price(new BigDecimal("3500000"))
                    .build());

            carRepository.save(Car.builder()
                    .id(UUID.randomUUID())
                    .carModel("HATCHBACK")
                    .name("Clio")
                    .orderQuantity(20)
                    .chasisNo(123456L)
                    .price(new BigDecimal("1500000"))
                    .build());
        }
    }
}
