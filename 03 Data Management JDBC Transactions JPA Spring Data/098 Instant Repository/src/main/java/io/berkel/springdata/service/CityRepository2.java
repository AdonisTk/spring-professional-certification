package io.berkel.springdata.service;

import org.springframework.data.repository.RepositoryDefinition;

import io.berkel.springdata.model.City;

@RepositoryDefinition(domainClass = City.class, idClass = Long.class)
public interface CityRepository2 {
	
	Iterable<City> findAll();

}
