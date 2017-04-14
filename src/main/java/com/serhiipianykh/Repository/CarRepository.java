package com.serhiipianykh.Repository;

import com.serhiipianykh.Entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by serhiipianykh on 2017-04-14.
 */
public interface CarRepository extends MongoRepository<Car, String> {

    public List<Car> findByClientId(String clientId);
}
