package io.berkel.springdata.service;

import org.springframework.data.repository.CrudRepository;

import io.berkel.springdata.model.City;

public interface CityRepository1 extends CrudRepository<City,Long> {
   
}
