package com.example.algamoney.api.v2.unit.core.usecase.categoria;

import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.core.usecase.categoria.ListarCategoriasUseCaseImpl;
import com.example.algamoney.api.v2.ports.out.CategoriaRepositoryPort;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.MockitoAnnotations.openMocks;

public class ListarCategoriaUseCaseImplTest {

    @InjectMocks
    private ListarCategoriasUseCaseImpl useCase;

    @Mock
    private CategoriaRepositoryPort repository;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void deveRetornarListaVazia() {
        List<Categoria> list = new ArrayList<>();

        Mockito.when(repository.listar()).thenReturn(list);

        List<Categoria> listaRetornada = useCase.executar();

        assertNotNull(listaRetornada);
        assertEquals(0, listaRetornada.size());
    }

    @Test
    void deveRetornarListaComCategorias() {
        List<Categoria> list = CategoriaMockFactory.obterListaCategoriaMock();

        Mockito.when(repository.listar()).thenReturn(list);

        List<Categoria> listaRetornada = useCase.executar();

        assertNotNull(listaRetornada);
        assertEquals(2, listaRetornada.size());
        assertEquals("Despesas Básicas", listaRetornada.get(1).getNome());

    }
}
