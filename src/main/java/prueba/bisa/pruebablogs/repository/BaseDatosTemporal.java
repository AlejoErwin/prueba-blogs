package prueba.bisa.pruebablogs.repository;

import org.springframework.stereotype.Component;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.Blog;

import java.util.*;

@Component
public class BaseDatosTemporal {


    private List<Autor> autores;
    private List<Blog> blogs;

    public BaseDatosTemporal() {
        this.autores = new ArrayList<>();
        this.blogs =  new ArrayList<>();
    }

    public Autor crearAutor(Autor autor){
        if(autores.add(autor)){
            return autor;
        }else {
            return null;
        }
    }


    public List<Autor> ListaAutor(){
        for (Autor autor: autores) {
            System.out.println(autor);
        }
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
        for (Blog blog: blogs) {
            System.out.println(blog);
        }
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
}
