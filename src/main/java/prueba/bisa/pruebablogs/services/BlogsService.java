package prueba.bisa.pruebablogs.services;
import org.springframework.stereotype.Service;
import prueba.bisa.pruebablogs.Exceptions.RegistroNoPermitidoException;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Comentario;
import prueba.bisa.pruebablogs.models.Usuario;
import prueba.bisa.pruebablogs.models.request.BlogRequest;
import prueba.bisa.pruebablogs.models.request.ComentarioRequest;
import prueba.bisa.pruebablogs.repository.RepositoryImp;

import java.util.List;
import java.util.Optional;

@Service
public class BlogsService {

    private RepositoryImp<Blog> repository;
    private AutorService autorService;

    public BlogsService(RepositoryImp<Blog> repository, AutorService autorService) {
        this.repository = repository;
        this.autorService = autorService;
    }

    public Blog crearNuevoBlogsService(BlogRequest nuevoBlogRequest) {
        Autor autor = autorService.porIdAutor(nuevoBlogRequest.getIdAutor());
        return repository.guardar(new Blog(autor, nuevoBlogRequest.getTema(), nuevoBlogRequest.getPeriodicidadBlog(), nuevoBlogRequest.getComentario()));

    }

    public List<Blog> listaBlogs() {
        return repository.lista();
    }

    public Blog actualizarBlogs(BlogRequest blogEdit) {

        Optional<Autor> autor = Optional.ofNullable(autorService.porIdAutor(blogEdit.getIdAutor()));
        if(!autor.isPresent()){
            throw new RegistroNoPermitidoException("No existe un autor registrado.");
        }
        return repository.editar(new Blog(blogEdit.getId(),autor.get(), blogEdit.getTema(), blogEdit.getPeriodicidadBlog(), blogEdit.getComentario()));
    }

    public Blog consultarBlogs(Blog blog) {
        return null;
    }


    public Blog porIdBlog(Integer id) {
        return repository.porId(id);
    }





}
