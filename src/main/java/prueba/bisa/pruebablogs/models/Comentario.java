package prueba.bisa.pruebablogs.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Comentario {

    private Integer id;

    @NotNull(message = "El blog no puede ser nulo")
    private Blog blog;

    @NotNull(message = "El usuario no puede ser nulo")
    private Usuario usuario;

    private String comentario;

    @NotNull(message = "La puntuación no puede ser nula")
    @Min(value = 0, message = "La puntuación debe ser mínimo 0")
    @Max(value = 10, message = "La puntuación debe ser máximo 10")
    private Integer puntuacion;
    private static int ultimoId;

    public Comentario() {
        this.id = ++ultimoId;
    }

    public Comentario(Blog blog, Usuario usuario, String comentario, Integer puntuacion) {
        this();
        this.blog = blog;
        this.usuario = usuario;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "blog=" + blog +
                ", usuario=" + usuario +
                ", puntuacion=" + puntuacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario comentario = (Comentario) o;
        return Objects.equals(id, comentario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
