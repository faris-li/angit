package com.hy.integration;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class StarApplication extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(StarApplication.class);
	
	@GetMapping
	public String homepage(){
		return "homepage";
	}

	/**
	 * The entry point of application.
	 *
	 * @param args
	 *            the input arguments
	 * @throws IOException
	 *             the io exception
	 */
	public static void main(String[] args) throws IOException {
		SpringApplication application = new SpringApplication(StarApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		LOGGER.info("Hy started!!!");
	}
}
