package nmfs.dal.mongo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nmfs.dal.mongo.service.PersonService;
import nmfs.umaiapp.model.Person;


//@CrossOrigin
@RestController
@RequestMapping(value="/bora2")
public class DefaultController {

	@Autowired
	PersonService service;
    
    @RequestMapping(value="/test1",method=RequestMethod.GET)
	public ResponseEntity<String> manualRunJob1() {
		     Person p=Person.builder().email("bora@borauzun.net").personId(1).name("Bora").build();
		     List<Person> list=new ArrayList<Person>();
		     list.add(p);
		     service.create(list);
	         return new ResponseEntity<String>("Test 1 ",HttpStatus.OK);
	}
	
    @RequestMapping(value="/test2",method=RequestMethod.GET)
  	public ResponseEntity<List<Person>> test2() {
  		    List<Person> list= (List<Person>) service.getAll();
  	         return new ResponseEntity<List<Person>>(list,HttpStatus.OK);
  	}
    
    @RequestMapping(value="/register",method=RequestMethod.GET)
   	public ResponseEntity<String> register() {
    	 UUID uuid = UUID.randomUUID();
         String randomUUIDString = uuid.toString();
   	         return new ResponseEntity<String>(randomUUIDString,HttpStatus.OK);
   	}
    
    
}

