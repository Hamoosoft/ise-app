package com.example.ise_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/x")
public class IseAppApplication {
        @GetMapping("/xx")
	public static void main(String[] args) {
		SpringApplication.run(IseAppApplication.class, args);
        int x = 3+5;
        System.out.print(x);

	}

}
