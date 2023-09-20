package com.minsait.meteorologia.service.impl;

import com.minsait.meteorologia.domain.DadoMeteorologico;
import com.minsait.meteorologia.domain.Estacao;
import com.minsait.meteorologia.reposiroty.DadoMeteorologicoRepository;
import com.minsait.meteorologia.reposiroty.EstacaoRepository;
import com.minsait.meteorologia.service.DadoMeteorologicoService;
import com.minsait.meteorologia.service.dto.DadoMeteorologicoRequest;
import com.minsait.meteorologia.service.dto.DadoMeteorologicoResponse;
import com.minsait.meteorologia.service.exception.EstacaoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class DadoMeteorologicoServiceImpl implements DadoMeteorologicoService {

    private DadoMeteorologicoRepository dadoMeteorologicoRepository;

    private EstacaoRepository estacaoRepository;

    @Autowired
    public DadoMeteorologicoServiceImpl(DadoMeteorologicoRepository dadoMeteorologicoRepository,
                                        EstacaoRepository estacaoRepository) {
        this.dadoMeteorologicoRepository = dadoMeteorologicoRepository;
        this.estacaoRepository = estacaoRepository;
    }

    @Override
    public DadoMeteorologicoResponse salvar(DadoMeteorologicoRequest dadoMeteorologicoRequest) throws EstacaoNotFoundException {

        Estacao estacao = estacaoRepository.findById(dadoMeteorologicoRequest.getIdEstacao()).orElse(null);

        if (estacao == null) {
            throw new EstacaoNotFoundException("Estação com id "
                    + dadoMeteorologicoRequest.getIdEstacao() + " não encontrado");
        }

        DadoMeteorologico dadoMeteorologico = new DadoMeteorologico();
        dadoMeteorologico.setEstacao(estacao);
        dadoMeteorologico.setDataHora(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        dadoMeteorologico.setPrecipitacao(dadoMeteorologicoRequest.getPrecipitacao());
        dadoMeteorologico.setPressao(dadoMeteorologicoRequest.getPressao());
        dadoMeteorologico.setTemperatura(dadoMeteorologicoRequest.getTemperatura());
        dadoMeteorologico.setUmidade(dadoMeteorologicoRequest.getUmidade());
        dadoMeteorologico.setVento(dadoMeteorologicoRequest.getVento());

        return new DadoMeteorologicoResponse(dadoMeteorologicoRepository.save(dadoMeteorologico));
    }
}
