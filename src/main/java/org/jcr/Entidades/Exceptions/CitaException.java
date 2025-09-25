package org.jcr.Entidades.Exceptions;


public class CitaException extends Exception {

    public CitaException(String message) {
        super(message);
    }

    public CitaException(String message, Throwable cause) {
        super(message, cause);
    }
}

