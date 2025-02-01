package prueba.bisa.pruebablogs.services;

import org.springframework.stereotype.Service;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Comentario;
import prueba.bisa.pruebablogs.models.Usuario;
import prueba.bisa.pruebablogs.models.request.ComentarioRequest;
import prueba.bisa.pruebablogs.models.request.NuevoAutorRequest;
import prueba.bisa.pruebablogs.repository.RepositoryImp;

import java.util.List;

@Service
public class ComentarioService {

    private RepositoryImp<Comentario> repository;
    private UsuarioService usuarioService;
    private BlogsService blogsService;

    public ComentarioService(RepositoryImp<Comentario> repository, UsuarioService usuarioService,BlogsService blogsService) {
        this.repository = repository;
        this.usuarioService = usuarioService;
        this.blogsService = blogsService;
    }

    public Comentario crearComentario(ComentarioRequest comentario) {
        Usuario usuario = usuarioService.crearNuevoAutor(new Usuario(comentario.getNombre(), comentario.getCorreo(), comentario.getPais()));
        Blog blog = blogsService.porIdBlog(comentario.getIdBlog());
        return repository.guardar(new Comentario(blog,usuario,comentario.getComentario(),comentario.getPuntuacion()));
    }

    public List<Comentario> listaComentario() {
        return repository.lista();
    }
}
