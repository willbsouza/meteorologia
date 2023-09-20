package com.minsait.meteorologia.reposiroty;

import com.minsait.meteorologia.domain.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacaoRepository extends JpaRepository<Estacao, Long> {
}
