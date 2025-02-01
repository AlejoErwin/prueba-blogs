package prueba.bisa.pruebablogs.models.request;

import prueba.bisa.pruebablogs.models.enumModels.PeriodicidadBlog;

public class BlogRequest {

    private Integer id;
    private Integer idAutor;
    private String tema;
    private PeriodicidadBlog periodicidadBlog;
    private Boolean comentario;

    public BlogRequest(Integer id, Integer idAutor, String tema, PeriodicidadBlog periodicidadBlog, Boolean comentario) {
        this.id = id;
        this.idAutor = idAutor;
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

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
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
}
