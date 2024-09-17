package EjComponente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gato implements SerVivo{
    @Autowired
    private Persona duenio;

    public Gato(Persona duenio) {
        this.duenio = duenio;
    }

    public Persona getDuenio() {
        return duenio;
    }

    @Override
    public String caminar() {
        return "El gato camina en sus tres patas. wow";
    }
}
