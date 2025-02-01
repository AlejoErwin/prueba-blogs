package prueba.bisa.pruebablogs.models.request;

import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Usuario;

public class ComentarioRequest {

    private String nombre;
    private String correo;
    private String pais;
    private Integer idBlog;
    private String comentario;
    private Integer puntuacion;

    public ComentarioRequest(String nombre, String correo, String pais, Integer idBlog, String comentario, Integer puntuacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.idBlog = idBlog;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

}
