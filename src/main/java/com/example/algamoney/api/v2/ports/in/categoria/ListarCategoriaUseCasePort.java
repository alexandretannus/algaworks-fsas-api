package com.example.algamoney.api.v2.ports.in.categoria;

import com.example.algamoney.api.v2.core.model.Categoria;

import java.util.List;

public interface ListarCategoriaUseCasePort {
    List<Categoria> executar();
}
