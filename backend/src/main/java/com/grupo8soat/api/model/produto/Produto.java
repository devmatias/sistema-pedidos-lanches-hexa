package com.grupo8soat.api.model.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Produto {
    private Long id;
    private CategoriaProduto categoria;
    private String nome;
    private String descricao;
    private BigDecimal preco;

}
