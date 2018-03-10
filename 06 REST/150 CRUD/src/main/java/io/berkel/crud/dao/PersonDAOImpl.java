package io.berkel.crud.dao;

import io.berkel.crud.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addPerson(Person person) {
        entityManager.persist(person);
		logger.info("Person saved successfully: " + person);
	}

	@Override
	public void updatePerson(Person person) {
		entityManager.merge(person);
        logger.info("Person updated successfully: " + person);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		List<Person> personsList = entityManager.createQuery("SELECT p FROM Person p").getResultList();
        logger.info("Persons: " + personsList);
        return personsList;
	}

	@Override
	public Person getPersonById(int id) {
		Person person = (Person) entityManager.createQuery("SELECT p FROM Person p WHERE p.id = :id")
                .setParameter("id",id)
                .getSingleResult();
        logger.info("Person retrieved successfully: " + person);
        return person;
	}

	@Override
	public void removePerson(int id) {
        entityManager.createQuery("DELETE FROM Person p WHERE p.id = :id")
                .setParameter("id",id)
                .executeUpdate();
        logger.info("Person has been removed successfully: " + id);
    }

}
