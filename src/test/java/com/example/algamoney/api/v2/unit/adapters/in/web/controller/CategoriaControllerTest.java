package com.example.algamoney.api.v2.unit.adapters.in.web.controller;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.in.dto.CategoriaInputDTO;
import com.example.algamoney.api.v2.adapters.in.service.CategoriaInService;
import com.example.algamoney.api.v2.adapters.in.web.controller.CategoriaController;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
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

        when(service.listar()).thenReturn(listaDto);

        ResponseEntity<?> response = controller.listar();

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().toString().contains("Testes"));
    }

    @Test
    void deveRetornarStatus201_QuandoCategoriaValida() {
        CategoriaInputDTO inputDTO = CategoriaMockFactory.obterCategoriaInputDto();
        Categoria categoria = CategoriaMockFactory.obterCategoriaMock();

        when(service.salvar(inputDTO)).thenReturn(categoria);

        ResponseEntity<?> response = controller.salvar(inputDTO);

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(201, response.getStatusCodeValue());
        assertTrue(response.getBody().toString().contains("Testes"));
    }

}