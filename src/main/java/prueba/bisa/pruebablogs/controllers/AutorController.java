package prueba.bisa.pruebablogs.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.request.NuevoAutorRequest;
import prueba.bisa.pruebablogs.services.AutorService;

import java.util.List;

@RestController
@RequestMapping("v1/autor")
public class AutorController {

    private AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @Operation(summary = "Crea un nuevo autor", description = "Crea un nuevo autor")
    @PostMapping("crearAutor")
    public Autor crearAutor(@RequestBody NuevoAutorRequest nuevoAutorRequest) {
        return autorService.crearNuevoAutor(nuevoAutorRequest);
    }


    @Operation(summary = "Obtiene todos los autores creados", description = "Obtiene todos los autores creados")
    @GetMapping("lista")
    public List<Autor> listaAutor() {
        return autorService.listaAutor();
    }

}
