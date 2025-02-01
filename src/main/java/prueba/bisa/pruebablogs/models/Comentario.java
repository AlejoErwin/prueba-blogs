package prueba.bisa.pruebablogs.models;

public class Comentario {

    private Blog blog;
    private Usuario usuario;
    private Integer puntuacion;

    public Comentario(Blog blog, Usuario usuario, Integer puntuacion) {
        this.blog = blog;
        this.usuario = usuario;
        this.puntuacion = puntuacion;
    }

    public Comentario() {
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
}
