package prueba.bisa.pruebablogs.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prueba.bisa.pruebablogs.config.ControlException;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.request.NuevoAutorRequest;
import prueba.bisa.pruebablogs.services.AutorService;
import java.util.List;

@RestController
@RequestMapping("v1/autor")
public class AutorController extends ControlException {

    private AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping("crearAutor")
    @Operation(summary = "Obtener lista de usuarios")
    public ResponseEntity<Autor> crearAutor(@Valid @RequestBody NuevoAutorRequest nuevoAutorRequest) {
        return ResponseEntity.ok(autorService.crearNuevoAutor(nuevoAutorRequest));
    }


    @GetMapping("lista")
    public List<Autor> listaAutor() {
        return autorService.listaAutor();
    }



}
