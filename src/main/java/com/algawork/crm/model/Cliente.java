package com.algawork.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity //Anotação do JPA. Quando anota a classe com @Entity diz que ela é uma entidade, e uma entidade é maapeada para uma tabela do banco de dados
public class Cliente {

    @Id //Propriedade que indentifica nossa Entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia para geração de valores de ID. IDENTIYY O bando de dados fica responsável
    private Long id;

    @Column(nullable = false)
    private String nome;


}
