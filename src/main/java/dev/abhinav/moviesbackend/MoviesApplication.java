package dev.abhinav.moviesbackend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
