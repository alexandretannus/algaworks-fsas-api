package com.example.algamoney.api.v2.ports.out;

import com.example.algamoney.api.v2.core.model.Categoria;

import java.util.List;

public interface CategoriaRepositoryPort {
    List<Categoria> listar();
}
