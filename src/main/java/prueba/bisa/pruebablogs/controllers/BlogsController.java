package prueba.bisa.pruebablogs.controllers;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Comentario;
import prueba.bisa.pruebablogs.models.request.BlogRequest;
import prueba.bisa.pruebablogs.models.request.ComentarioRequest;
import prueba.bisa.pruebablogs.services.BlogsService;

import java.util.List;


@RestController
@RequestMapping("v1/blogs")
public class BlogsController {


    private final BlogsService blogsService;

    public BlogsController(BlogsService blogsService) {
        this.blogsService = blogsService;
    }


    @Operation(summary = "Crea un nuevo blog", description = "Crea un nuevo blog")
    @PostMapping("crearNuevoBlogs")
    public Blog crearNuevoBlogs(@RequestBody BlogRequest blog) {
        return blogsService.crearNuevoBlogsService(blog);
    }


    @PutMapping("actualizarBlogs")
    public Blog actualizarBlogs(@RequestBody BlogRequest blog) {
        return blogsService.actualizarBlogs(blog);
    }

    @GetMapping("blogId/{id}")
    public Blog consultarBlogs(@PathVariable(name = "id") Integer id) {
        return blogsService.porIdBlog(id);
    }

    @Operation(summary = "Obtiene todos los blogs creados", description = "Obtiene todos los blogs creados")
    @GetMapping("lista/blogs")
    public List<Blog> listaBlogs() {
        return blogsService.listaBlogs();
    }


}
