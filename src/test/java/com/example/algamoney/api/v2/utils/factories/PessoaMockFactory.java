package com.example.algamoney.api.v2.utils.factories;

import com.example.algamoney.api.v2.adapters.out.entity.PessoaEntity;
import com.example.algamoney.api.v2.core.model.Endereco;
import com.example.algamoney.api.v2.core.model.Pessoa;

public class PessoaMockFactory {

    public static Pessoa getPessoaMock() {
        return Pessoa.builder()
                .codigo(123L)
                .nome("João Silva")
                .endereco(obterEnderecoMock())
                .ativo(true)
                .build();
    }

    public static PessoaEntity getPessoaEntityMock() {
        return PessoaEntity.builder()
                .codigo(123L)
                .nome("João Silva")
                .endereco(obterEnderecoMock())
                .ativo(true)
                .build();
    }

    private static Endereco obterEnderecoMock() {
        return Endereco.builder()
                .logradouro("Rua dos Bobos")
                .numero("0")
                .bairro("Bairro da Alegria")
                .cep("01234-56")
                .cidade("Cidade")
                .estado("Estado")
                .build();
    }
}
