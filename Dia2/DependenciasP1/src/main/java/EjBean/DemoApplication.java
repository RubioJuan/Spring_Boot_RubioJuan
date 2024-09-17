package EjBean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //Las fases del ciclo de vida de un bean en Spring Boot son las siguientes:
        //
        //- **Instantiation:**En esta fase, el contenedor de Spring Boot crea una instancia del bean.
        //- **Configuration:**En esta fase, el contenedor de Spring Boot llama a los métodos de configuración del bean.
        //- **Initialization:**En esta fase, el contenedor de Spring Boot llama a los métodos de inicialización del bean.
        //- **Ready:**En esta fase, el bean está listo para ser utilizado.
        //- **Destruction:**En esta fase, el contenedor de Spring Boot destruye el bean.
        ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

        SerVivo persona = contexto.getBean(Persona.class);
        SerVivo serpiente = contexto.getBean(Serpiente.class);

        System.out.println(persona.caminar());
        System.out.println(serpiente.caminar());
    }
}
