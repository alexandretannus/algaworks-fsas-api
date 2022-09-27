package com.example.algamoney.api.v2.adapters.out.repository;

import com.example.algamoney.api.v2.adapters.out.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository2 extends JpaRepository<PessoaEntity, Long> {
}
