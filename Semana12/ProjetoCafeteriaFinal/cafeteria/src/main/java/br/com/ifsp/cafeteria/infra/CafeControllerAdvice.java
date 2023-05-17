package br.com.ifsp.cafeteria.infra;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class CafeControllerAdvice {

    @ExceptionHandler(CafeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse 
    	handleCafeNotFoundException(CafeNotFoundException ex) {
        	return new ErrorResponse(HttpStatus.NOT_FOUND.value(), 
        			ex.getMessage());
    }
}
