package com.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCampleSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCampleSimpleApplication.class, args);
	}

	@Autowired
	CamelContext camelContext;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

		return args -> {

			camelContext.addRoutes(new RouteBuilder() {

				public void configure() {
					from("file:C:\\Users\\nirpanig\\Desktop\\linuxvideos\\in?noop=true").routeId("hello3")
							.to("file:C:\\Users\\nirpanig\\Desktop\\linuxvideos\\out");
				}
				

			});

		};
	}
}
