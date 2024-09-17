package EjComponente;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeansApplication {
    public static void main(String[] args) {
        ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionDuenio.class);

        Gato gato = contexto.getBean(Gato.class);
        System.out.println(gato.getDuenio());
    }
}
