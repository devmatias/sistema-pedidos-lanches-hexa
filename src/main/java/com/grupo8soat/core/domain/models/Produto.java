package com.grupo8soat.core.domain.models;

import com.grupo8soat.core.domain.models.enums.CategoriaProduto;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class Produto {
    private Long id;
    private CategoriaProduto categoria;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}
