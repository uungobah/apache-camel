package com.uun.gobah.camelcopyfile;

import com.uun.gobah.camelcopyfile.service.SimpleRouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelCopyfileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CamelCopyfileApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
		CamelContext ctx = new DefaultCamelContext();
		try {
			ctx.addRoutes(routeBuilder);
			ctx.start();
			Thread.sleep(5 * 60 * 1000);
			ctx.stop();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
