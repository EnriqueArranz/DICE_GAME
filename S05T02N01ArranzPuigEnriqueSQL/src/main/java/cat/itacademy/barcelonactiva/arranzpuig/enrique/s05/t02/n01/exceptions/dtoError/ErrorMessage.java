package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.exceptions.dtoError;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

    private HttpStatus status;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}