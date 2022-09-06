package com.example.algamoney.api.v2.adapters.out.service;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.adapters.out.mappers.CategoriaOutMapper;
import com.example.algamoney.api.v2.adapters.out.repository.CategoriaRepository2;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.ports.out.CategoriaRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoriaOutService implements CategoriaRepositoryPort {

    private final CategoriaRepository2 repository;

    @Override
    public List<Categoria> listar() {
        List<CategoriaEntity> list = repository.findAll();
        return CategoriaOutMapper.INSTANCE.toModelList(list);
    }
}
