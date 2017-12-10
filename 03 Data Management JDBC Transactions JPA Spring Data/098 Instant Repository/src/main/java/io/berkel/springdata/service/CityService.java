package io.berkel.springdata.service;

import io.berkel.springdata.model.City;

public interface CityService {

    Iterable<City> findAll();

}
