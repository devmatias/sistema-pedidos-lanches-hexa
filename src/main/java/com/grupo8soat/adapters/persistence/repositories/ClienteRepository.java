package com.grupo8soat.adapters.persistence.repositories;


import com.grupo8soat.core.domain.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
