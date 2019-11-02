package nmfs.dal.mongo.dao;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import nmfs.umaiapp.model.Person;

@Repository
public interface PersonDAO extends MongoRepository<Person, Integer>,PersonDAOCustom {
	@Query("{'name' : {$ne : null}}")
	List<Person> findByNameNotNull();
	
}