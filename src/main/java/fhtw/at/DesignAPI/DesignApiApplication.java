package fhtw.at.DesignAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static fhtw.at.DesignAPI.services.Service.colors;


@SpringBootApplication
public class DesignApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignApiApplication.class, args);
	}

	public static String findColor(String color) {
		String findcolor = colors.get(color.toLowerCase());
		return findcolor;
	}
}


