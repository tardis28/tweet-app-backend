package com.tweetapp.api.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.tweetapp.api.TweetApplication;


/** 
 * 		extends SpringBootServletInitializer which is an opinionated 
 * 		WebApplicationInitializer to run a SpringApplication from a traditional WAR deployment
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TweetApplication.class);
	}

}
