package edu.escuelaing.arsw.tallertablerointeractivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class TallerTableroInteractivoApplication {
	@Resource
	private HttpServletRequest request;

	public static void main(String[] args) {

		SpringApplication.run(TallerTableroInteractivoApplication.class, args);
	}
	@GetMapping("/setname")
	public String setName(@RequestParam(value = "name", defaultValue =
			"Anónimo") String name) {
		request.getSession().setAttribute("name", name);
		return String.format("Hello %s!", name);
	}
}
