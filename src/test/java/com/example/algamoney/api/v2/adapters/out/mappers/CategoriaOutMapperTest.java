package com.example.algamoney.api.v2.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.Test;

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
    void deveRetornarNulo_QuandoEntidadeForNula() {
        Categoria categoria = CategoriaOutMapper.INSTANCE.toModel(null);

        assertNull(categoria);
    }

    @Test
    void deveRetornarNulo_QuandoModeloForNulo() {
        CategoriaEntity entity = CategoriaOutMapper.INSTANCE.fromModel(null);

        assertNull(entity);
    }
}