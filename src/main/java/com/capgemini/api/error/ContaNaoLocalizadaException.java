package com.capgemini.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ContaNaoLocalizadaException extends RuntimeException {

    public ContaNaoLocalizadaException(String message) {
        super(message);
    }
}
