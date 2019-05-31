package com.log4j2.yml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2YmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4j2YmlApplication.class, args);

		Logger logger = LogManager.getLogger(Log4j2YmlApplication.class);
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
	}
}