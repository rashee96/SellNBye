package springboot.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BuyingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BuyingApplication.class, args);
	}

}
