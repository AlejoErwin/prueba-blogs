package prueba.bisa.pruebablogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prueba.bisa.pruebablogs.models.Autor;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PruebaBlogsApplication {

    public static void main(String[] args) {
        List<Autor> autores = new ArrayList<>();
        SpringApplication.run(PruebaBlogsApplication.class, args);
    }

}
