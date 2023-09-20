package com.minsait.meteorologia.service;

import com.minsait.meteorologia.service.dto.DadoMeteorologicoRequest;
import com.minsait.meteorologia.service.dto.DadoMeteorologicoResponse;
import com.minsait.meteorologia.service.exception.EstacaoNotFoundException;

public interface DadoMeteorologicoService {

    DadoMeteorologicoResponse salvar(DadoMeteorologicoRequest dadoMeteorologicoRequest) throws EstacaoNotFoundException;
}
