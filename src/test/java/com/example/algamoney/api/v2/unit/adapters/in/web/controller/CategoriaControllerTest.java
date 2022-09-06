package com.example.algamoney.api.v2.unit.adapters.in.web.controller;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.in.service.CategoriaInService;
import com.example.algamoney.api.v2.adapters.in.web.controller.CategoriaController;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.MockitoAnnotations.openMocks;

class CategoriaControllerTest {

    @InjectMocks
    private CategoriaController controller;

    @Mock
    private CategoriaInService service;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void deveRetornarListaEStatus200() {
        List<CategoriaDTO> listaDto = CategoriaMockFactory.obterListaCategoriaDtoMock();

        Mockito.when(service.listar()).thenReturn(listaDto);

        ResponseEntity<?> response = controller.listar();

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().toString().contains("Testes"));
    }
}