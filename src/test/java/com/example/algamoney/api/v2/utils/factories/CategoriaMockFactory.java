package com.example.algamoney.api.v2.utils.factories;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.core.model.Categoria;

import java.util.UUID;

public class CategoriaMockFactory {
    public static CategoriaEntity obterCategoriaEntityMock() {
        return CategoriaEntity.builder()
                .codigo(1234L)
                .nome("Testes")
                .build();
    }
    public static Categoria obterCategoriaMock() {
        return Categoria.builder()
                .codigo(1234L)
                .nome("Testes")
                .build();
    }
}
