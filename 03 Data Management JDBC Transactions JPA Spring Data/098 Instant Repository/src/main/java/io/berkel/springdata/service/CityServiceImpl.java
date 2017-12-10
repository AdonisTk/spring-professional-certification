package io.berkel.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.berkel.springdata.model.City;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository;
	
	@Override
	public Iterable<City> findAll() {
		return cityRepository.findAll();
	}

}
