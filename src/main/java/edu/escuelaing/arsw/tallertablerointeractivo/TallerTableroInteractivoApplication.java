package edu.escuelaing.arsw.tallertablerointeractivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class TallerTableroInteractivoApplication {

	public static void main(String[] args) {

		SpringApplication.run(TallerTableroInteractivoApplication.class, args);
	}

}
