package com.example.algamoney.api.v2.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.PessoaEntity;
import com.example.algamoney.api.v2.core.model.Pessoa;
import com.example.algamoney.api.v2.utils.factories.PessoaMockFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaOutMapperTest {

    @Test
    void deveRetornarModelo_QuandoEntidadeForValida() {
        PessoaEntity entity = PessoaMockFactory.getPessoaEntityMock();

        Pessoa pessoa = PessoaOutMapper.INSTANCE.toModel(entity);

        assertNotNull(pessoa);
        assertEquals(pessoa.getCodigo(), entity.getCodigo());
        assertEquals(pessoa.getNome(), entity.getNome());
        assertEquals(pessoa.getEndereco(), entity.getEndereco());
        assertEquals(pessoa.getAtivo(), entity.getAtivo());

    }

    @Test
    void deveRetornarEntidade_QuandoModeloForValido() {
        Pessoa pessoa = PessoaMockFactory.getPessoaMock();

        PessoaEntity entity = PessoaOutMapper.INSTANCE.fromModel(pessoa);

        assertNotNull(entity);
        assertEquals(pessoa.getCodigo(), entity.getCodigo());
        assertEquals(pessoa.getNome(), entity.getNome());
        assertEquals(pessoa.getEndereco(), entity.getEndereco());
        assertEquals(pessoa.getAtivo(), entity.getAtivo());

    }

    @Test
    void deveRetornarNulo_QuandoEntidadeForNula() {
        Pessoa pessoa = PessoaOutMapper.INSTANCE.toModel(null);

        assertNull(pessoa);

    }

    @Test
    void deveRetornarNulo_QuandoModeloForNulo() {
        PessoaEntity entity = PessoaOutMapper.INSTANCE.fromModel(null);

        assertNull(entity);
    }
}