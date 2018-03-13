package io.berkel.crud.dao;

import io.berkel.crud.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addPerson(Person person) {
		entityManager.persist(person);
	}

	@Override
	public void updatePerson(Person person) {
		entityManager.merge(person);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		List<Person> personsList = entityManager.createQuery("SELECT p FROM Person p").getResultList();
        return personsList;
	}

	@Override
	public Person getPersonById(int id) {
		Person person = (Person) entityManager.createQuery("SELECT p FROM Person p WHERE p.id = :id")
                .setParameter("id",id)
                .getSingleResult();
        return person;
	}

	@Override
	public void removePerson(int id) {
		entityManager.createQuery("DELETE FROM Person p WHERE p.id = :id")
                .setParameter("id",id)
                .executeUpdate();
    }

}
