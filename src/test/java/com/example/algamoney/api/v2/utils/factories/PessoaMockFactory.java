package com.example.algamoney.api.v2.utils.factories;

import com.example.algamoney.api.v2.adapters.out.entity.PessoaEntity;
import com.example.algamoney.api.v2.core.model.Endereco;
import com.example.algamoney.api.v2.core.model.Pessoa;

public class PessoaMockFactory {

    private static final Long CODIGO_PESSOA = 123L;
    private static final String NOME_PESSOA = "João Silva";
    public static final String ENDERECO_LOGRADOURO = "Rua dos Bobos";
    public static final String ENDERECO_NUMERO = "0";
    public static final String ENDERECO_BAIRRO = "Bairro da Alegria";
    public static final String ENDERECO_CEP = "01234-56";
    public static final String ENDERECO_CIDADE = "Cidade";
    public static final String ENDERECO_ESTADO = "Estado";

    public static Pessoa getPessoaMock() {
        return Pessoa.builder()
                .codigo(CODIGO_PESSOA)
                .nome(NOME_PESSOA)
                .endereco(obterEnderecoMock())
                .ativo(true)
                .build();
    }

    public static PessoaEntity getPessoaEntityMock() {
        return PessoaEntity.builder()
                .codigo(CODIGO_PESSOA)
                .nome(NOME_PESSOA)
                .endereco(obterEnderecoMock())
                .ativo(true)
                .build();
    }

    private static Endereco obterEnderecoMock() {
        return Endereco.builder()
                .logradouro(ENDERECO_LOGRADOURO)
                .numero(ENDERECO_NUMERO)
                .bairro(ENDERECO_BAIRRO)
                .cep(ENDERECO_CEP)
                .cidade(ENDERECO_CIDADE)
                .estado(ENDERECO_ESTADO)
                .build();
    }

}
