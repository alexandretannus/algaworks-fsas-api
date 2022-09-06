package com.example.algamoney.api.v2.utils.factories;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.core.model.Categoria;

import java.util.Arrays;
import java.util.List;

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

    public static CategoriaDTO obterCategoriaDtoMock() {
        return CategoriaDTO.builder()
                .codigo(1234L)
                .nome("Testes")
                .build();
    }

    public static List<Categoria> obterListaCategoriaMock() {
        Categoria categoria1 = obterCategoriaMock();
        Categoria categoria2 = Categoria.builder()
                .codigo(9876L)
                .nome("Despesas Básicas")
                .build();

        return Arrays.asList(categoria1, categoria2);
    }

    public static List<CategoriaEntity> obterListaCategoriaEntityMock() {
        CategoriaEntity categoria1 = obterCategoriaEntityMock();
        CategoriaEntity categoria2 = CategoriaEntity.builder()
                .codigo(9876L)
                .nome("Despesas Básicas")
                .build();

        return Arrays.asList(categoria1, categoria2);
    }

    public static List<CategoriaDTO> obterListaCategoriaDtoMock() {
        CategoriaDTO categoria1 = obterCategoriaDtoMock();
        CategoriaDTO categoria2 = CategoriaDTO.builder()
                .codigo(9876L)
                .nome("Despesas Básicas")
                .build();

        return Arrays.asList(categoria1, categoria2);
    }
}
