package com.minsait.meteorologia.service.impl;

import com.minsait.meteorologia.domain.Estacao;
import com.minsait.meteorologia.reposiroty.EstacaoRepository;
import com.minsait.meteorologia.service.EstacaoService;
import com.minsait.meteorologia.service.dto.EstacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstacaoServiceImpl implements EstacaoService {

    private EstacaoRepository estacaoRepository;

    @Autowired
    public EstacaoServiceImpl(EstacaoRepository estacaoRepository) {
        this.estacaoRepository = estacaoRepository;
    }

    @Override
    public List<EstacaoResponse> listarTodas() {
        List<Estacao> estacoes = estacaoRepository.findAll();

        return estacoes.stream()
                .map(EstacaoResponse::new)
                .collect(Collectors.toList());
    }
}
