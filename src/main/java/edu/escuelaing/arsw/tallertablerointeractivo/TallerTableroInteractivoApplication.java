package edu.escuelaing.arsw.tallertablerointeractivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
/**
 * Es la clase principal donde se ejcuta el programa y esta el main.
 */
public class TallerTableroInteractivoApplication {
	/**
	 * Metodo principal de la clase
	 * @param args
	 */

	public static void main(String[] args) {

		SpringApplication.run(TallerTableroInteractivoApplication.class, args);
	}

}
