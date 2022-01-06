package com.algawork.crm.repository;

import com.algawork.crm.model.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<cliente, Long> {
}
