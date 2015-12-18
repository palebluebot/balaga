package com.amithkoujalgi.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.amithkoujalgi.rest.RestResource;

public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(RequestContextFilter.class);
		packages(RestResource.class.getPackage().getName());
		register(LoggingFilter.class);
	}
}