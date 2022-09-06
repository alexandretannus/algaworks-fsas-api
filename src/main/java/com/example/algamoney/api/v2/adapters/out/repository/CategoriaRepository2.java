package com.example.algamoney.api.v2.adapters.out.repository;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository2 extends JpaRepository<CategoriaEntity, Long> {
    
}
