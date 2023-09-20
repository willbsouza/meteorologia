package com.minsait.meteorologia.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.minsait.meteorologia.domain.DadoMeteorologico;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class DadoMeteorologicoResponse {

    private Long id;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataHora;
    private String precipitacao;
    private String pressao;
    private String temperatura;
    private String umidade;
    private String vento;

    public DadoMeteorologicoResponse(DadoMeteorologico dadoMeteorologico) {
        this.id = dadoMeteorologico.getId();
        this.dataHora = dadoMeteorologico.getDataHora();
        this.precipitacao = dadoMeteorologico.getPrecipitacao();
        this.pressao = dadoMeteorologico.getPressao();
        this.temperatura = dadoMeteorologico.getTemperatura();
        this.umidade = dadoMeteorologico.getUmidade();
        this.vento = dadoMeteorologico.getVento();
    }
}
