package pl.michal.demorepo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Dzięki Jsr310 javaPersistanceAPI jest w stanie
// przekonvwertować czas podany na bazie na
// nowoczesną klasę LocalDate


@SpringBootApplication
public class Demorepo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demorepo2Application.class, args);
	}
}
