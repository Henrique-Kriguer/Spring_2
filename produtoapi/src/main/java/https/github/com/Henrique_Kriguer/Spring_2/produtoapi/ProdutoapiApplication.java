package https.github.com.Henrique_Kriguer.Spring_2.produtoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutoapiApplication {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World, I´m using Spring Boot";
	}
	public static void main(String[] args){
		SpringApplication.run(ProdutoapiApplication.class, args);
	}
}
