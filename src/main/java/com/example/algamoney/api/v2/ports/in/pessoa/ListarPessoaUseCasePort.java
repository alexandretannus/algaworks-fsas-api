package com.example.algamoney.api.v2.ports.in.pessoa;

import com.example.algamoney.api.v2.core.model.Pessoa;

import java.util.List;

public interface ListarPessoaUseCasePort {
    List<Pessoa> executar();
}
