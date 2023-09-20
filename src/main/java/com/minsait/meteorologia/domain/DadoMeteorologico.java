package com.minsait.meteorologia.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_dado_meteorologico")
public class DadoMeteorologico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;
    private String precipitacao;
    private String pressao;
    private String temperatura;
    private String umidade;
    private String vento;

    @ManyToOne
    @JoinColumn(name = "id_estacao")
    private Estacao estacao;
}
