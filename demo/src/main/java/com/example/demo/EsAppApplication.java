package com.example.demo;
import com.example.demo.user.*;
import org.apache.tomcat.jni.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class EsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsAppApplication.class, args);
	}
}
