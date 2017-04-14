package com.serhiipianykh;

import com.serhiipianykh.Entity.Car;
import com.serhiipianykh.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by serhiipianykh on 2017-04-14.
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        carRepository.deleteAll();

        carRepository.save(new Car("1","1","F12"));
        carRepository.save(new Car("2","2","812"));

        System.out.println("Cars found with findAll():");
        System.out.println("-------------------------------");
        for (Car car : carRepository.findAll()) {
            System.out.println(car);
        }
        System.out.println();


        System.out.println("--------------------------------");
        for (Car car : carRepository.findByClientId("1")) {
            System.out.println(car.getModel());
        }
    }
}
