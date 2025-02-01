package prueba.bisa.pruebablogs.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prueba.bisa.pruebablogs.config.ControlException;
import prueba.bisa.pruebablogs.models.Comentario;
import prueba.bisa.pruebablogs.models.request.ComentarioRequest;
import prueba.bisa.pruebablogs.services.ComentarioService;

import java.util.List;

@RestController
@RequestMapping("v1/comentario")
public class ComentarioController extends ControlException {


    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping("crearComentario")
    public ResponseEntity<Comentario> crearComentario(@RequestBody ComentarioRequest comentario) {
        return ResponseEntity.ok(comentarioService.crearComentario(comentario));
    }

    @GetMapping("lista")
    public List<Comentario> listaComentarios() {
        return comentarioService.listaComentario();
    }

}
