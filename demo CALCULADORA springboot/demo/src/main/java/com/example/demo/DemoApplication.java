package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping("/CALCULADORA/operar/{n1}/{n2}")
	public String operar(@PathVariable String n1, @PathVariable String n2){
		return "\nValores Ingresados: " + n1 + " y "+n2+"\n\n /////OPERACIONES:" +
				"\n\nSuma = " + (Integer.parseInt(n1) + Integer.parseInt(n2)) +
				"\n\nResta =" + (Integer.parseInt(n1) - Integer.parseInt(n2)) +
				"\n\nMultiplicación=" + (Integer.parseInt(n1) * Integer.parseInt(n2))+
				"\n\nDivisión = " + (Double.parseDouble(n1) / Double.parseDouble(n2))+"";
	}


}
