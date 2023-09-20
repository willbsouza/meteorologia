package com.minsait.meteorologia.service;

import com.minsait.meteorologia.service.dto.EstacaoResponse;

import java.util.List;

public interface EstacaoService {

    List<EstacaoResponse> listarTodas();
}
