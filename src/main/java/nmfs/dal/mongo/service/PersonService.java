package nmfs.dal.mongo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


import nmfs.umaiapp.model.Person;

public interface PersonService {

	public void create(List<Person> item);
	public Collection<Person> getAll();
	public Optional<Person> findById(int id);
	public void deleteById(int id);
	public void update(Person emp);
	public void deleteAll();
}
