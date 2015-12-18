package com.amithkoujalgi.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.springframework.stereotype.Service;

import com.amithkoujalgi.domain.Message;

@Singleton
@Service
public class MessageService {
	List<Message> messages = Collections.synchronizedList(new ArrayList<Message>());

	@PostConstruct
	public void init() {
		messages.add(new Message("Joe", "Hello"));
		messages.add(new Message("Jane", "Spring boot is cool !"));
	}

	public List<Message> getMessages() {
		return messages;
	}
}
