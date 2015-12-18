package com.amithkoujalgi.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amithkoujalgi.domain.Message;
import com.amithkoujalgi.service.MessageService;

@Path("/")
@Component
public class RestResource {

	@Autowired
	private MessageService messageService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hello")
	public String hello() {
		return "Hello World";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/messages")
	public List<Message> message() {
		return messageService.getMessages();
	}
}
