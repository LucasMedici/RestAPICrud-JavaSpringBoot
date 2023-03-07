package com.br.RestAPICrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.RestAPICrud.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
