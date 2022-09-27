package com.example.algamoney.api.v2.adapters.out.service;

import com.example.algamoney.api.v2.adapters.out.entity.PessoaEntity;
import com.example.algamoney.api.v2.adapters.out.mappers.PessoaOutMapper;
import com.example.algamoney.api.v2.adapters.out.repository.PessoaRepository2;
import com.example.algamoney.api.v2.core.model.Pessoa;
import com.example.algamoney.api.v2.ports.out.PessoaRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PessoaOutService implements PessoaRepositoryPort {

    private PessoaRepository2 repository;

    @Override
    public List<Pessoa> listar() {
        List<PessoaEntity> pessoas = repository.findAll();

        return PessoaOutMapper.INSTANCE.toListModel(pessoas);
    }
}
