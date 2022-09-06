package com.example.algamoney.api.v2.unit.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.adapters.out.mappers.CategoriaOutMapper;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaOutMapperTest {

    @Test
    void deveRetornarModelo_QuandoEntidadeForValida() {
        CategoriaEntity entity = CategoriaMockFactory.obterCategoriaEntityMock();

        Categoria categoria = CategoriaOutMapper.INSTANCE.toModel(entity);

        assertNotNull(categoria);
        assertEquals(categoria.getCodigo(), entity.getCodigo());
        assertEquals(categoria.getNome(), entity.getNome());
    }

    @Test
    void deveRetornarEntidade_QuandoModeloForValido() {
        Categoria categoria = CategoriaMockFactory.obterCategoriaMock();

        CategoriaEntity entity = CategoriaOutMapper.INSTANCE.fromModel(categoria);

        assertNotNull(categoria);
        assertEquals(categoria.getCodigo(), entity.getCodigo());
        assertEquals(categoria.getNome(), entity.getNome());
    }

    @Test
    void deveRetornarListaModelo_QuandoListaEntidadeForValida() {
        List<CategoriaEntity> entities = CategoriaMockFactory.obterListaCategoriaEntityMock();

        List<Categoria> categorias = CategoriaOutMapper.INSTANCE.toModelList(entities);

        assertNotNull(categorias);
        assertEquals(categorias.get(0).getCodigo(), entities.get(0).getCodigo());
        assertEquals(categorias.get(0).getNome(), entities.get(0).getNome());
        assertEquals(categorias.get(1).getCodigo(), entities.get(1).getCodigo());
        assertEquals(categorias.get(1).getNome(), entities.get(1).getNome());
    }

    @Test
    void deveRetornarNulo_QuandoEntidadeForNula() {
        Categoria categoria = CategoriaOutMapper.INSTANCE.toModel(null);

        assertNull(categoria);
    }

    @Test
    void deveRetornarNulo_QuandoModeloForNulo() {
        CategoriaEntity entity = CategoriaOutMapper.INSTANCE.fromModel(null);

        assertNull(entity);
    }


    @Test
    void deveRetornarNulo_QuandoListaEntidadeForNula() {
        List<Categoria> categoria = CategoriaOutMapper.INSTANCE.toModelList(null);

        assertNull(categoria);
    }
}