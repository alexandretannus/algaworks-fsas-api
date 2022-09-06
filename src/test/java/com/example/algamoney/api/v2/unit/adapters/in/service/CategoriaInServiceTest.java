package com.example.algamoney.api.v2.unit.adapters.in.service;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.in.service.CategoriaInService;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.ports.in.categoria.ListarCategoriaUseCasePort;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.MockitoAnnotations.openMocks;

class CategoriaInServiceTest {

    @InjectMocks
    private CategoriaInService service;

    @Mock
    private ListarCategoriaUseCasePort listarCategoriaUseCasePort;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void deveRetornarListaDeCategorias() {
        List<Categoria> categoriaList = CategoriaMockFactory.obterListaCategoriaMock();

        Mockito.when(listarCategoriaUseCasePort.executar()).thenReturn(categoriaList);

        List<CategoriaDTO> listaCategoriaDto = service.listar();

        Assertions.assertNotNull(listaCategoriaDto);
        Assertions.assertEquals(2, listaCategoriaDto.size());
    }
}