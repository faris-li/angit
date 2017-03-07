package com.hy;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hy.base.ServletContextHolder;

@Controller
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement // 启用事务
public class StarApplication extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(StarApplication.class);

	@Bean
	public ServletContextInitializer servletContextInitializer() {
		return new ServletContextInitializer() {
			@Override
			public void onStartup(ServletContext servletContext) throws ServletException {
				ServletContextHolder.setServletContext(servletContext);
			}
		};
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.bannerMode(Banner.Mode.OFF);
        return builder.sources(StarApplication.class); // 以 war 包形式发布时需要此设置
    }
	
	@RequestMapping
	public String go() {
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
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
