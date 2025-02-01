package prueba.bisa.pruebablogs.models;

public class Usuario {

    private String nombre;
    private String correo;
    private String pais;

    public Usuario(String nombre, String correo, String pais) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
    }

    public Usuario() {
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

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
