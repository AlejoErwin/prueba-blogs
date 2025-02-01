package prueba.bisa.pruebablogs.models.response;

import java.time.LocalDateTime;
import java.util.Map;

public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private Map<String, String> motivo;
    private String path;

    public ErrorResponse(LocalDateTime timestamp, int status, String error, Map<String, String> motivo, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.motivo = motivo;
        this.path = path;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public Map<String, String> getMotivo() {
        return motivo;
    }

    public String getPath() {
        return path;
    }

}
