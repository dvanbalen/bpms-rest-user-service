package com.redhat.consulting.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.consulting.User;

public class RestServiceImpl implements RestService {
	
	private static Logger LOG = LoggerFactory.getLogger(RestServiceImpl.class);
	
	public String getHello(String name) {
		
		String greeting = null;
		
		LOG.info("Processing GET hello for "+name);
		
		greeting = "GET Hello, "+name;
		
		LOG.info("Returning greeting from GET: "+greeting);
		
		return greeting;
	}
	
	public String postHello(String name) {
		String greeting = null;
		
		LOG.info("Processing POST hello for "+name);
		
		greeting = "POST Hello, "+name;
		
		LOG.info("Returning greeting from POST: "+greeting);
		
		return greeting;
	}
	
	public User process(User user) {
		
		LOG.info("Processing an item in rest service, "+user);
		
		user.setFirstName("John");
		user.setLastName("Smith");
		
		LOG.info("Processed an item in rest service, "+user);
		
		return user;
	}
	
	public void throwException() throws Exception {
		throw new Exception("Throwing an exception.");
	}

}