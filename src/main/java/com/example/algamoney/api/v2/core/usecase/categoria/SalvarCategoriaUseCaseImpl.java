package com.example.algamoney.api.v2.core.usecase.categoria;

import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.ports.in.categoria.SalvarCategoriaUseCasePort;
import com.example.algamoney.api.v2.ports.out.CategoriaRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SalvarCategoriaUseCaseImpl implements SalvarCategoriaUseCasePort {

    private final CategoriaRepositoryPort repository;

    @Override
    public Categoria executar(Categoria categoria) {
        return repository.salvar(categoria);
    }
}
