package com.minsait.meteorologia.reposiroty;

import com.minsait.meteorologia.domain.DadoMeteorologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadoMeteorologicoRepository extends JpaRepository<DadoMeteorologico, Long> {
}
