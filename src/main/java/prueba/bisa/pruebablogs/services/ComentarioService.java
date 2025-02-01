package prueba.bisa.pruebablogs.services;

import org.springframework.stereotype.Service;
import prueba.bisa.pruebablogs.Exceptions.RegistroNoPermitidoException;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Comentario;
import prueba.bisa.pruebablogs.models.Usuario;
import prueba.bisa.pruebablogs.models.request.ComentarioRequest;
import prueba.bisa.pruebablogs.models.request.NuevoAutorRequest;
import prueba.bisa.pruebablogs.repository.RepositoryImp;

import java.util.List;
import java.util.Optional;

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

        Optional<Blog> blog = Optional.ofNullable(blogsService.porIdBlog(comentario.getIdBlog()));
        if(!blog.isPresent()){
            throw new RegistroNoPermitidoException("No existe un blog registrado.");
        }
        if(!blog.get().getComentario()){
            throw new RegistroNoPermitidoException("No se puede agregar ya que el blog esta cerrado a comentarios.");
        }
        return repository.guardar(new Comentario(blog.get(),usuario,comentario.getComentario(),comentario.getPuntuacion()));
    }

    public List<Comentario> listaComentario() {
        return repository.lista();
    }
}
