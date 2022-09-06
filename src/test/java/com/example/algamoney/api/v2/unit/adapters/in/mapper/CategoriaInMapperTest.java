package com.example.algamoney.api.v2.unit.adapters.in.mapper;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.in.mapper.CategoriaInMapper;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.MockitoAnnotations.openMocks;

class CategoriaInMapperTest {

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void deveRetornarModelo_QuandoDtoForValido() {
        CategoriaDTO dto = CategoriaMockFactory.obterCategoriaDtoMock();

        Categoria categoria = CategoriaInMapper.INSTANCE.fromDto(dto);

        assertNotNull(categoria);
        assertEquals(categoria.getCodigo(), dto.getCodigo());
        assertEquals(categoria.getNome(), dto.getNome());
    }

    @Test
    void deveRetornarDto_QuandoModeloForValido() {
        Categoria categoria = CategoriaMockFactory.obterCategoriaMock();

        CategoriaDTO dto = CategoriaInMapper.INSTANCE.toDto(categoria);

        assertNotNull(categoria);
        assertEquals(categoria.getCodigo(), dto.getCodigo());
        assertEquals(categoria.getNome(), dto.getNome());
    }

    @Test
    void deveRetornarNulo_QuandoDtoForNulo() {
        Categoria categoria = CategoriaInMapper.INSTANCE.fromDto(null);

        assertNull(categoria);
    }

    @Test
    void deveRetornarNulo_QuandoModeloForNulo() {
        CategoriaDTO dto = CategoriaInMapper.INSTANCE.toDto(null);

        assertNull(dto);
    }

    @Test
    void deveRetornarListaDto_QuandoListaModeloForValido() {
        List<Categoria> listaCategoria = CategoriaMockFactory.obterListaCategoriaMock();

        List<CategoriaDTO> listaDto = CategoriaInMapper.INSTANCE.toDtoList(listaCategoria);

        assertNotNull(listaDto);
        assertEquals("Despesas Básicas", listaDto.get(1).getNome());
    }


    @Test
    void deveRetornarNulo_QuandoListaModeloForNulo() {

        List<CategoriaDTO> listaDto = CategoriaInMapper.INSTANCE.toDtoList(null);

        assertNull(listaDto);
    }

}