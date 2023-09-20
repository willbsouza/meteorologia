package com.minsait.meteorologia.controller.exception;

import com.minsait.meteorologia.service.exception.EstacaoNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ControllerErrorHandler {
    @ExceptionHandler(EstacaoNotFoundException.class)
    public ResponseEntity<StandardError> idEstacaoNaoEncontrado(EstacaoNotFoundException e, HttpServletRequest request) {

        StandardError erro = new StandardError();
        erro.setTimestamp(Instant.now());
        erro.setStatus(HttpStatus.BAD_REQUEST.value());
        erro.setError("ID da estação informado inexistente.");
        erro.setMessage(e.getMessage());
        erro.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}
