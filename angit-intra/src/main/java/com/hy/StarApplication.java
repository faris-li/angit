package com.hy;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement //启用事务
public class StarApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(StarApplication.class);

	@RequestMapping
	public String hello() {
		return "Hello World!";
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
