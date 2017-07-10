package io.berkel.reflectiontestutils.service;

import io.berkel.reflectiontestutils.model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public Person newPerson() {
		return new Person();
	}

}
