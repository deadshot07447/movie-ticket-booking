package com.movieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MovieTicketBookingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingApiApplication.class, args);
	}

}
