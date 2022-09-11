package com.example.algamoney.api.v2.ports.in.categoria;

import com.example.algamoney.api.v2.core.model.Categoria;

public interface SalvarCategoriaUseCasePort {
    Categoria executar(Categoria categoria);
}
