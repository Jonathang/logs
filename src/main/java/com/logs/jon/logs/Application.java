package com.logs.jon.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;

@SpringBootApplication
public class Application {

	private static final Logger registro = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		System.out.println("Zona horaria configurada: " +
				ZoneId.systemDefault());
		SpringApplication.run(Application.class, args);

		registro.info("LOG DE PRUEBA");
		registro.debug("Este es un log DEBUG");
		registro.error("Ocurrió un error en {}", "el sistema");
	}

}
