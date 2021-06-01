package net.talkingbot.jenkinsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsXTutorialApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JenkinsXTutorialApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsXTutorialApplication.class, args);
	}

}
