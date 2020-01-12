package com.poc.ws.PocSBA7.resouces;

import java.io.Serializable;

public class GenericResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;
    private String error;

    public GenericResponse(final String message, String error) {
        this.message = message;
        this.error = error;
    }

    public GenericResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}