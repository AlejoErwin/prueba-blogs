package prueba.bisa.pruebablogs.repository;

import org.springframework.stereotype.Component;
import prueba.bisa.pruebablogs.models.*;

import java.util.*;

@Component
public class BaseDatosTemporal {


    private List<Autor> autores;
    private List<Blog> blogs;
    private List<Usuario> usuarios;
    private List<Comentario> comentarios;

    public BaseDatosTemporal() {
        this.autores = new ArrayList<>();
        this.blogs =  new ArrayList<>();
        this.usuarios =  new ArrayList<>();
        this.comentarios =  new ArrayList<>();
    }

    public Autor crearAutor(Autor autor){
        if(autores.add(autor)){
            return autor;
        }else {
            return null;
        }
    }


    public List<Autor> ListaAutor(){
        return autores;
    }

    public Autor porIdAutor(Integer id) {
        Autor resultado = null;
        for(Autor autor: autores){
            if(autor.getId() != null && autor.getId().equals(id)){
                resultado = autor;
                break;
            }
        }
        return resultado;
    }


    // PARA BLOGS

    public Blog crearBlogs(Blog autor){
        if(blogs.add(autor)){
            return autor;
        }else {
            return null;
        }
    }

    public Blog editarBlogs(Blog autor){
        Blog c = this.porIdBlog(autor.getId());
        c.setAutor(autor.getAutor());
        c.setTema(autor.getTema());
        c.setComentario(autor.getComentario());
        c.setPeriodicidadBlog(autor.getPeriodicidadBlog());
        return autor;
    }

    public List<Blog> ListaBlogs(){
        return blogs;
    }

    public Blog porIdBlog(Integer id) {
        Blog resultado = null;
        for(Blog blog: blogs){
            if(blog.getId() != null && blog.getId().equals(id)){
                resultado = blog;
                break;
            }
        }
        return resultado;
    }

    // PARA USUARIOS

    public Usuario crearUsuario(Usuario usuario){
        if(usuarios.add(usuario)){
            return usuario;
        }else {
            return null;
        }
    }

    // PARA EL COMENTARIO
    public Comentario crearComentario(Comentario comentario){
        if(comentarios.add(comentario)){
            return comentario;
        }else {
            return null;
        }
    }

    public List<Comentario> listaComentario(){
        return comentarios;
    }

}
