package com.minsait.meteorologia.service.exception;

public class EstacaoNotFoundException extends RuntimeException {
    public EstacaoNotFoundException(String msg) {
        super(msg);
    }
}
