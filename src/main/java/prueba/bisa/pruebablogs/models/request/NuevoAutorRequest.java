package prueba.bisa.pruebablogs.models.request;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class NuevoAutorRequest {

    @NotNull(message = "El nombre no puede estar vacío")
    private String Nombre;

    @NotNull(message = "El apellido paterno no puede estar vacío")
    private String ApellidoPaterno;

    private String ApellidoMaterna;
    private Date fechaNacimiento;
    private String PaisResidencia;
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
