package com.example.algamoney.api.v2.core.usecase.categoria;

import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.ports.in.categoria.ListarCategoriaUseCasePort;
import com.example.algamoney.api.v2.ports.out.CategoriaRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ListarCategoriasUseCaseImpl implements ListarCategoriaUseCasePort {

    private final CategoriaRepositoryPort repository;

    @Override
    public List<Categoria> executar() {
        return repository.listar();
    }
}
