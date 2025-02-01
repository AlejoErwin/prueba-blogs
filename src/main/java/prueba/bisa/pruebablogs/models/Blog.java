package prueba.bisa.pruebablogs.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import prueba.bisa.pruebablogs.models.enumModels.PeriodicidadBlog;

import java.util.Objects;

public class Blog {

    private Integer id;
    private Autor autor;
    private String tema;
    private PeriodicidadBlog periodicidadBlog;
    private Boolean comentario;
    private static int ultimoId;

    public Blog() {
        this.id = ++ultimoId;
    }

    public Blog(Autor autor, String tema, PeriodicidadBlog periodicidadBlog, Boolean comentario) {
        this();
        this.autor = autor;
        this.tema = tema;
        this.periodicidadBlog = periodicidadBlog;
        this.comentario = comentario;
    }

    public Blog(Integer id, Autor autor, String tema, PeriodicidadBlog periodicidadBlog, Boolean comentario) {
        this.id = id;
        this.autor = autor;
        this.tema = tema;
        this.periodicidadBlog = periodicidadBlog;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public PeriodicidadBlog getPeriodicidadBlog() {
        return periodicidadBlog;
    }

    public void setPeriodicidadBlog(PeriodicidadBlog periodicidadBlog) {
        this.periodicidadBlog = periodicidadBlog;
    }

    public Boolean getComentario() {
        return comentario;
    }

    public void setComentario(Boolean comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", autor=" + autor +
                ", tema='" + tema + '\'' +
                ", periodicidadBlog=" + periodicidadBlog +
                ", comentario=" + comentario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(id, blog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
