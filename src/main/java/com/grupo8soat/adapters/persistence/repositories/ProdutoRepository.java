package com.grupo8soat.adapters.persistence.repositories;

import com.grupo8soat.core.domain.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
