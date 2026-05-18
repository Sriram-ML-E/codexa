package com.codexa.codexa_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("com.codexa")
@EntityScan("com.codexa.model")
@EnableJpaRepositories("com.codexa.repository")
public class CodexaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodexaBackendApplication.class, args);
	}

	@GetMapping("/test")
    public String test() {
        return "Codexa Backend Running";
    }

}
