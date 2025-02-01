package prueba.bisa.pruebablogs.controllers;

import org.springframework.web.bind.annotation.*;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Comentario;
import prueba.bisa.pruebablogs.models.request.ComentarioRequest;
import prueba.bisa.pruebablogs.services.BlogsService;
import prueba.bisa.pruebablogs.services.ComentarioService;

import java.util.List;

@RestController
@RequestMapping("v1/comentario")
public class ComentarioController {


    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping("crearComentario")
    public Comentario crearComentario(@RequestBody ComentarioRequest comentario) {
        return comentarioService.crearComentario(comentario);
    }

    @GetMapping("lista")
    public List<Comentario> listaComentarios() {
        return comentarioService.listaComentario();
    }

}
