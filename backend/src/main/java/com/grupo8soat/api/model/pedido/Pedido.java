package com.grupo8soat.api.model.pedido;

import com.grupo8soat.api.model.cliente.Cliente;
import com.grupo8soat.api.model.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Pedido {

    private Long id;
    private String numero;
    private StatusPedido statusPedido;
    private StatusPagamento statusPagamento;
    private Cliente cliente;
    private List<Produto> produtos;
    private BigDecimal valorTotal;
    private BigDecimal desconto;

}
