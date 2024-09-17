package EjComponente;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Gato.class)
public class ConfiguracionDuenio {
    @Bean
    public Persona getPersona() {
        return new Persona("David Velásquez");
    }
}
