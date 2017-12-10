package io.berkel.springdata.service;

import java.util.List;

import io.berkel.springdata.model.City;

public interface CityService {

	City create(City newCity);

	void delete(Long id);

    List<City> findAll();

    City findById(Long id);

    City update(City updatedCity);

}
