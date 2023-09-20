package com.minsait.meteorologia.controller;

import com.minsait.meteorologia.service.DadoMeteorologicoService;
import com.minsait.meteorologia.service.dto.DadoMeteorologicoRequest;
import com.minsait.meteorologia.service.dto.DadoMeteorologicoResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados")
public class DadoMeteorologicoController {

    private DadoMeteorologicoService dadoMeteorologicoService;

    @Autowired
    public DadoMeteorologicoController(DadoMeteorologicoService dadoMeteorologicoService) {
        this.dadoMeteorologicoService = dadoMeteorologicoService;
    }

    @PostMapping
    public ResponseEntity<DadoMeteorologicoResponse> salvar(@RequestBody @Valid DadoMeteorologicoRequest dadoMeteorologicoRequest) {
        return new ResponseEntity<DadoMeteorologicoResponse>(dadoMeteorologicoService.salvar(dadoMeteorologicoRequest), HttpStatus.CREATED);
    }
}
