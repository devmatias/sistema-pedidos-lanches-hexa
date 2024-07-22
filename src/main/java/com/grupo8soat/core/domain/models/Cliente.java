package com.grupo8soat.core.domain.models;

import lombok.Data;

import java.util.List;

@Data
public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
}
