package com.example.algamoney.api.v2.ports.out;

import com.example.algamoney.api.v2.core.model.Pessoa;

import java.util.List;

public interface PessoaRepositoryPort {
    List<Pessoa> listar();
}
