package com.grupo8soat.adapters.persistence.repositories;

import com.grupo8soat.core.domain.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
