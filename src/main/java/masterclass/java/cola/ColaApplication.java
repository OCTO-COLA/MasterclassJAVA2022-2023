package masterclass.java.cola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColaApplication.class, args);
	}
	@Autowired
	masterclass.java.cola.persistence.repositories.PlatRepository platRepository;

}
