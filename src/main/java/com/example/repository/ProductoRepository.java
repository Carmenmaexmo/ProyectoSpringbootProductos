// src/main/java/com/example/repository/ProductoRepository.java
package com.example.repository;

import com.example.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}