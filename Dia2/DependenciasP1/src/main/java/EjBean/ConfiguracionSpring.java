package EjBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionSpring {
    @Bean
    public SerVivo persona(){
        return new Persona("Juan Rubio");
    }

    @Bean
    public SerVivo serpiente(Persona persona){
        Serpiente serpiente = new Serpiente();
        System.out.println("La serpiente ataca a "+persona.getNombre());
        return serpiente;
    }
}

