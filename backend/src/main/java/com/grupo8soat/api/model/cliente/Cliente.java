package com.grupo8soat.api.model.cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
}
