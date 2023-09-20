package com.minsait.meteorologia.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_estacao")
public class Estacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String codigo;
    private String nome;

    @Enumerated(EnumType.STRING)
    private UF uf;
    private String regiaoMeteorologica;
    private String latitude;
    private String longitude;
    private String altura;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estacao")
    private List<DadoMeteorologico> dadosMeteorologicos = new ArrayList<>();

}