package teste.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;	
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		System.out.println("Teste");
		SpringApplication.run(TesteApplication.class, args);
	}

}
