package io.berkel.springdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.berkel.springdata.model.City;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository;
	

	@Override
	public City create(City newCity) {
		return cityRepository.save(newCity);
	}

	@Override
	public void delete(Long id) {
		
	}

	@Override
	public List<City> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City update(City updatedCity) {
		// TODO Auto-generated method stub
		return null;
	}

}
