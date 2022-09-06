package com.example.algamoney.api.v2.unit.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.adapters.out.entity.LancamentoEntity;
import com.example.algamoney.api.v2.adapters.out.mappers.LancamentoOutMapper;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.core.model.Lancamento;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import com.example.algamoney.api.v2.utils.factories.LancamentoMockFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LancamentoOutMapperTest {

    @Test
    void deveRetornarModelo_QuandoEntidadeForValida() {
        LancamentoEntity entity = LancamentoMockFactory.obterLancamentoEntityMock();

        Lancamento lancamento = LancamentoOutMapper.INSTANCE.toModel(entity);

        assertNotNull(lancamento);
        assertEquals(entity.getCodigo(), lancamento.getCodigo());
        assertEquals(entity.getCategoria().getNome(), lancamento.getCategoria().getNome());
        assertEquals(entity.getDataPagamento(), lancamento.getDataPagamento());
        assertEquals(entity.getDataVencimento(), lancamento.getDataVencimento());
        assertEquals(entity.getDescricao(), lancamento.getDescricao());
        assertEquals(entity.getObservacao(), lancamento.getObservacao());
        assertEquals(entity.getPessoa().getNome(), lancamento.getPessoa().getNome());
        assertEquals(entity.getTipo(), lancamento.getTipo());
        assertEquals(entity.getValor(), lancamento.getValor());
    }

    @Test
    void deveRetornarEntidade_QuandoModeloForValido() {
        Lancamento lancamento = LancamentoMockFactory.obterLancamentoMock();

        LancamentoEntity entity = LancamentoOutMapper.INSTANCE.fromModel(lancamento);

        assertNotNull(entity);
        assertEquals(entity.getCodigo(), lancamento.getCodigo());
        assertEquals(entity.getCategoria().getNome(), lancamento.getCategoria().getNome());
        assertEquals(entity.getDataPagamento(), lancamento.getDataPagamento());
        assertEquals(entity.getDataVencimento(), lancamento.getDataVencimento());
        assertEquals(entity.getDescricao(), lancamento.getDescricao());
        assertEquals(entity.getObservacao(), lancamento.getObservacao());
        assertEquals(entity.getPessoa().getNome(), lancamento.getPessoa().getNome());
        assertEquals(entity.getTipo(), lancamento.getTipo());
        assertEquals(entity.getValor(), lancamento.getValor());
    }

    @Test
    void deveRetornarNulo_QuandoEntidadeForNula() {
        Lancamento lancamento = LancamentoOutMapper.INSTANCE.toModel(null);

        assertNull(lancamento);
    }

    @Test
    void deveRetornarNulo_QuandoModeloForNulo() {
        LancamentoEntity entity = LancamentoOutMapper.INSTANCE.fromModel(null);

        assertNull(entity);
    }

    @Test
    void deveRetornarModelo_QuandoEntidadeForValidaEObjetosPessoaCategoriaNulos() {
        LancamentoEntity entity = LancamentoMockFactory.obterLancamentoEntityMock();
        entity.setCategoria(null);
        entity.setPessoa(null);

        Lancamento lancamento = LancamentoOutMapper.INSTANCE.toModel(entity);

        assertNotNull(lancamento);
        assertEquals(entity.getCodigo(), lancamento.getCodigo());
        assertNull(lancamento.getCategoria());
        assertEquals(entity.getDataPagamento(), lancamento.getDataPagamento());
        assertEquals(entity.getDataVencimento(), lancamento.getDataVencimento());
        assertEquals(entity.getDescricao(), lancamento.getDescricao());
        assertEquals(entity.getObservacao(), lancamento.getObservacao());
        assertNull(lancamento.getPessoa());
        assertEquals(entity.getTipo(), lancamento.getTipo());
        assertEquals(entity.getValor(), lancamento.getValor());
    }

    @Test
    void deveRetornarEntidade_QuandoModeloForValidoEObjetosPessoaCategoriaNulos() {
        Lancamento lancamento = LancamentoMockFactory.obterLancamentoMock();
        lancamento.setCategoria(null);
        lancamento.setPessoa(null);

        LancamentoEntity entity = LancamentoOutMapper.INSTANCE.fromModel(lancamento);

        assertNotNull(entity);
        assertEquals(entity.getCodigo(), lancamento.getCodigo());
        assertNull(entity.getCategoria());
        assertEquals(entity.getDataPagamento(), lancamento.getDataPagamento());
        assertEquals(entity.getDataVencimento(), lancamento.getDataVencimento());
        assertEquals(entity.getDescricao(), lancamento.getDescricao());
        assertEquals(entity.getObservacao(), lancamento.getObservacao());
        assertNull(entity.getPessoa());
        assertEquals(entity.getTipo(), lancamento.getTipo());
        assertEquals(entity.getValor(), lancamento.getValor());
    }
}
