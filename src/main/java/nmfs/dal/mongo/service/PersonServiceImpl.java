package nmfs.dal.mongo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import nmfs.dal.mongo.dao.PersonDAO;
import nmfs.umaiapp.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDAO dao;
	
	
	@Override
	public void create(List<Person> list) {
		dao.saveAll(list);
		
	}

	@Override
	public Collection<Person> getAll() {
		//dao.
		Collection<Person> list=dao.findByNameNotNull();
		int y=dao.findMaxId();
		return list;
	}

	@Override
	public Optional<Person> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Person emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
