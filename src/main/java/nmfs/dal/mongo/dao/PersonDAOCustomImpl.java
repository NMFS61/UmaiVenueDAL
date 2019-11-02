package nmfs.dal.mongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import nmfs.umaiapp.model.Person;

public class PersonDAOCustomImpl implements PersonDAOCustom{
	@Autowired 
	private MongoOperations operations;
	@Override
	public int findMaxId() {
		// TODO Auto-generated method stub
		List<Person> list=operations.findAll(Person.class);
		
		return 0;
	}

}
