package co.parkapp.parkapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"co.parkapp.parkapp.services.visitasservice"})
public class ParkappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkappApplication.class, args);
	}

}
