package com.mj_eno.sidedish.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EntityNotFoundException extends RuntimeException {

    private ErrorMessage errorMessage;

    public EntityNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public EntityNotFoundException(ErrorMessage errorMessage) {
        super(errorMessage.getErrorMessage());
        this.errorMessage = errorMessage;
    }
}
