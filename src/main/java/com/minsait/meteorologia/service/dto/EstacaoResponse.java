package com.minsait.meteorologia.service.dto;

import com.minsait.meteorologia.domain.Estacao;
import com.minsait.meteorologia.domain.UF;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class EstacaoResponse {

    private Long id;
    private String codigo;
    private String nome;
    private UF uf;
    private String regiaoMeteorologica;
    private String latitude;
    private String longitude;
    private String altura;

    public EstacaoResponse(Estacao estacao) {
        this.id = estacao.getId();
        this.codigo = estacao.getCodigo();
        this.nome = estacao.getNome();
        this.uf = estacao.getUf();
        this.regiaoMeteorologica = estacao.getRegiaoMeteorologica();
        this.latitude = estacao.getLatitude();
        this.longitude = estacao.getLongitude();
        this.altura = estacao.getAltura();
    }
}
