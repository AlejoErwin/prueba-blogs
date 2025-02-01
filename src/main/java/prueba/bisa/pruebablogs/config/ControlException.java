package prueba.bisa.pruebablogs.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import prueba.bisa.pruebablogs.Exceptions.RegistroNoPermitidoException;
import prueba.bisa.pruebablogs.models.response.ErrorResponse;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ControlException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage()));

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Bad Request",
                errors,
                ex.getBindingResult().getObjectName()
        );

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RegistroNoPermitidoException.class)
    public ResponseEntity<Map<String,String>> handleRegistroNoPermitidoException(RegistroNoPermitidoException ex) {
        Map<String, String> mensajeError = new HashMap<>();
        mensajeError.put("mensajeError", ex.getMessage());
        return ResponseEntity.status(403).body(mensajeError);
    }

}
