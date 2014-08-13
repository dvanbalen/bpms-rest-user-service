package com.redhat.consulting.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.consulting.User;

@Path("/bpmsrest/")
public interface RestService {
	
	@GET
	@Path("hello/{name}")
	public String getHello(@PathParam("name")String name);
	
	@POST
	@Path("hello")
	public String postHello(String name);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("user")
	public User process(User user);
	
	@GET
	@Path("exception")
	public void throwException() throws Exception;

}
