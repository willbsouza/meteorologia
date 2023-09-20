package com.minsait.meteorologia.service.dto;

import lombok.Getter;

@Getter
public class DadoMeteorologicoRequest {

    private String precipitacao;
    private String pressao;
    private String temperatura;
    private String umidade;
    private String vento;
    private Long idEstacao;
}
