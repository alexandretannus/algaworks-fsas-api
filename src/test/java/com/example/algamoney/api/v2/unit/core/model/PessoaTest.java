package com.example.algamoney.api.v2.unit.core.model;

import com.example.algamoney.api.v2.core.model.Pessoa;
import com.example.algamoney.api.v2.utils.factories.PessoaMockFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarFalso_QuandoUsuarioEstiverAtivo() {
        Pessoa pessoa = PessoaMockFactory.getPessoaMock();
        pessoa.setAtivo(true);

        assertNotNull(pessoa);
        assertFalse(pessoa.isInativo());
    }

    @Test
    void deveRetornarVerdadeiro_QuandoUsuarioEstiverInativo() {
        Pessoa pessoa = PessoaMockFactory.getPessoaMock();
        pessoa.setAtivo(false);

        assertNotNull(pessoa);
        assertTrue(pessoa.isInativo());
    }
}