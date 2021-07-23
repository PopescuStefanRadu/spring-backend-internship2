package ro.esolutions.internship.carrental.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ro.esolutions.internship.carrental.exception.EntityNotFoundException;

@ControllerAdvice(annotations = RestController.class)
public class ResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {EntityNotFoundException.class})
    public ResponseEntity<Object> handleEntityNotFound() {
        return ResponseEntity.badRequest().body("Nu e bine");
    }
}
