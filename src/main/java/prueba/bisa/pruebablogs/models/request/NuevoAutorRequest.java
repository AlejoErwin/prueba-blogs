package prueba.bisa.pruebablogs.models.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class NuevoAutorRequest {

    @NotNull(message = "El nombre no puede estar vacío")
    private String Nombre;

    @NotNull(message = "El apellido paterno no puede estar vacío")
    private String ApellidoPaterno;

    @NotNull(message = "El apellido materno no puede ser nulo")
    @Size(min = 2, max = 100, message = "El apellido materno debe tener entre 2 y 100 caracteres")
    private String ApellidoMaterna;

    @NotNull(message = "La fecha de nacimiento no puede ser nula")
    @Past(message = "La fecha de nacimiento debe ser una fecha pasada")
    private Date fechaNacimiento;

    @NotNull(message = "El país de residencia no puede ser nulo")
    @Size(min = 2, max = 100, message = "El país de residencia debe tener entre 2 y 100 caracteres")
    private String PaisResidencia;

    @NotNull(message = "El correo no puede ser nulo")
    @Email(message = "El correo debe tener un formato válido")
    private String correo;

    public NuevoAutorRequest(String nombre, String apellidoPaterno, String apellidoMaterna, Date fechaNacimiento, String paisResidencia, String correo) {
        Nombre = nombre;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterna = apellidoMaterna;
        this.fechaNacimiento = fechaNacimiento;
        PaisResidencia = paisResidencia;
        this.correo = correo;
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
        return "NuevoAutorRequest{" +
                "Nombre='" + Nombre + '\'' +
                ", ApellidoPaterno='" + ApellidoPaterno + '\'' +
                ", ApellidoMaterna='" + ApellidoMaterna + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", PaisResidencia='" + PaisResidencia + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
