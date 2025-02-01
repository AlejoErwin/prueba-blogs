package prueba.bisa.pruebablogs.models;

import jakarta.validation.constraints.*;

import java.util.Date;
import java.util.Objects;

public class Autor {

    private Integer id;

    @NotNull(message = "El nombre no puede estar nulo")
    @NotEmpty(message = "El nombre no puede estar vacío")
    private String Nombre;

    @NotNull(message = "El apellido paterno no puede ser nulo")
    @NotEmpty(message = "El apellido paterno no puede estar vacío")
    private String ApellidoPaterno;

    @NotNull(message = "El apellido materno no puede ser nulo")
    @NotEmpty(message = "El apellido materno no puede estar vacío")
    private String ApellidoMaterna;

    @NotNull(message = "La fecha no puede estar nulo")
    @NotEmpty(message = "La fecha no puede estar vacío")
    private Date fechaNacimiento;

    private String PaisResidencia;

    @Email(message = "El correo electrónico debe tener un formato válido")
    private String correo;

    private static int ultimoId;

    public Autor() {
        this.id = ++ultimoId;
    }

    public Autor(String nombre, String apellidoPaterno, String apellidoMaterna, Date fechaNacimiento, String paisResidencia, String correo) {
        this();
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidoPaterno;
        this.ApellidoMaterna = apellidoMaterna;
        this.fechaNacimiento = fechaNacimiento;
        this.PaisResidencia = paisResidencia;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterna() {
        return ApellidoMaterna;
    }

    public void setApellidoMaterna(String apellidoMaterna) {
        ApellidoMaterna = apellidoMaterna;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisResidencia() {
        return PaisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        PaisResidencia = paisResidencia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "Nombre='" + Nombre + '\'' +
                ", ApellidoPaterno='" + ApellidoPaterno + '\'' +
                ", ApellidoMaterna='" + ApellidoMaterna + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", PaisResidencia='" + PaisResidencia + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor cliente = (Autor) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
