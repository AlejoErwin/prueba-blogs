package prueba.bisa.pruebablogs.repository;

import org.springframework.stereotype.Component;
import prueba.bisa.pruebablogs.models.*;

import java.util.*;

@Component
public class BaseDatosTemporal {


    private List<Autor> autores;
    private List<Blog> blogs;
    private List<Blog> blogsHistorial;
    private List<Usuario> usuarios;
    private List<Comentario> comentarios;

    public BaseDatosTemporal() {
        this.autores = new ArrayList<>();
        this.blogsHistorial =  new ArrayList<>();
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

    public Blog crearBlogs(Blog blog){
        registrarBlogHistorial(blog);
        if(blogs.add(blog)){
            return blog;
        }else {
            return null;
        }
    }

    public Blog editarBlogs(Blog blog){
        blog.setUpdateData(new Date());
        registrarBlogHistorial(blog);
        Blog c = this.porIdBlog(blog.getId());
        c.setAutor(blog.getAutor());
        c.setTema(blog.getTema());
        c.setComentario(blog.getComentario());
        c.setPeriodicidadBlog(blog.getPeriodicidadBlog());
        return blog;
    }

    public void registrarBlogHistorial(Blog blog){
        blogsHistorial.add(blog);
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
