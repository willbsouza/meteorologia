package com.minsait.meteorologia.controller;

import com.minsait.meteorologia.service.EstacaoService;
import com.minsait.meteorologia.service.dto.EstacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estacoes")
public class EstacaoController {

    private EstacaoService estacaoService;

    @Autowired
    public EstacaoController(EstacaoService estacaoService) {
        this.estacaoService = estacaoService;
    }

    @GetMapping
    public ResponseEntity<List<EstacaoResponse>> listarTodas() {
        return new ResponseEntity<List<EstacaoResponse>>(estacaoService.listarTodas(), HttpStatus.OK);
    }
}
