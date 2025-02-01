package prueba.bisa.pruebablogs.models.request;

import jakarta.validation.constraints.*;
import prueba.bisa.pruebablogs.models.Blog;
import prueba.bisa.pruebablogs.models.Usuario;

public class ComentarioRequest {

    @NotNull(message = "El nombre no puede ser nulo")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String nombre;

    @NotNull(message = "El correo no puede ser nulo")
    @Email(message = "El correo debe tener un formato válido")
    private String correo;

    private String pais;

    @NotNull(message = "El id del blog no puede ser nulo")
    private Integer idBlog;

    private String comentario;

    @NotNull(message = "La puntuación no puede ser nula")
    @Min(value = 0, message = "La puntuación debe ser mínimo 0")
    @Max(value = 10, message = "La puntuación debe ser máximo 10")
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
