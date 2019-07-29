package com.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:demoRoute").routeId("hello2").log("Got message: ${body}");
	}

}
