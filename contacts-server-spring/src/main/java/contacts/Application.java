package contacts;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
@SpringBootApplication
public class Application {

	@PostConstruct
	public void init() {
		System.err.println("Contacts is Up at: " + new Date());
	}

	@PreDestroy
	public void end() {
		System.err.println("Contacts is Down at: " + new Date());
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
