package com.example.algamoney.api.v2.unit.adapters.out.service;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.adapters.out.repository.CategoriaRepository2;
import com.example.algamoney.api.v2.adapters.out.service.CategoriaOutService;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class CategoriaOutServiceTest {

    @InjectMocks
    private CategoriaOutService service;

    @Mock
    private CategoriaRepository2 repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveRetornarListaVazia() {
        List<CategoriaEntity> list = new ArrayList<>();
        when(repository.findAll()).thenReturn(list);

        List<Categoria> listaRetornada = service.listar();

        assertNotNull(listaRetornada);
        assertEquals(0, listaRetornada.size());
    }

    @Test
    void deveRetornarListaComObjetos() {
        List<CategoriaEntity> list = CategoriaMockFactory.obterListaCategoriaEntityMock();
        when(repository.findAll()).thenReturn(list);

        List<Categoria> listaRetornada = service.listar();

        assertNotNull(listaRetornada);
        assertEquals(2, listaRetornada.size());
        assertEquals("Despesas Básicas", listaRetornada.get(1).getNome());

    }
}
