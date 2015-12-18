package com.amithkoujalgi;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.amithkoujalgi.config.JerseyConfig;
import com.amithkoujalgi.rest.RestResource;
import com.amithkoujalgi.service.MessageService;

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = { RestResource.class, MessageService.class })
public class Application {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(Application.class).showBanner(true).run(args);
	}

	@Bean
	public ServletRegistrationBean jerseyServlet() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
		registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
		return registration;
	}
}
