package com.grupo8soat.core.domain.models;

import com.grupo8soat.core.domain.models.enums.StatusPagamento;
import com.grupo8soat.core.domain.models.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private StatusPedido statusPedido;
    private StatusPagamento statusPagamento;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produtos;
    private BigDecimal valorTotal;
    private BigDecimal desconto;

}
