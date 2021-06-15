package com.capgemini.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FormaRecebimentoException extends RuntimeException {

    public FormaRecebimentoException(String message) {
        super(message);
    }
}
