package com.algawork.crm.repository;

import com.algawork.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //O repository, é responsavel por interagir com o banco de dados.
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
