package com.example.DependenciasP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciasP1Application {


	//En el ámbito de la programación, se establece una relación denominada
	// "dependencia" entre dos módulos de código, donde un módulo
	// , llamado "dependiente", requiere la presencia de otro módulo
	// , conocido como "dependencia", para funcionar de
	// manera adecuada. En términos sencillos
	// , el módulo dependiente no puede operar de manera independiente
	// sin la existencia del módulo en el que depende.
	public static void main(String[] args) {

		//1. **Dependencias directas:** Estas se establecen de manera inmediata entre dos módulos.
		// Por ejemplo, si el módulo A utiliza la función f() del módulo B,
		// se establece una dependencia directa de A hacia B.
		//2. **Dependencias transitivas:** Estas se generan de manera indirecta.
		// Si el módulo A depende del módulo B, y a su vez, B depende del módulo C,
		// entonces se establece una dependencia transitiva de A hacia C.
		SpringApplication.run(DependenciasP1Application.class, args);
	}

}
