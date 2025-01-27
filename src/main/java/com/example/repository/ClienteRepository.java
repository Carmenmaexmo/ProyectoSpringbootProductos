// src/main/java/com/example/repository/ClienteRepository.java
package com.example.repository;

import com.example.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}