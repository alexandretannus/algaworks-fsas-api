package com.example.algamoney.api.v2.core.usecase.pessoa;

import com.example.algamoney.api.v2.core.model.Pessoa;
import com.example.algamoney.api.v2.ports.in.pessoa.ListarPessoaUseCasePort;
import com.example.algamoney.api.v2.ports.out.PessoaRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ListarPessoaUseCaseImpl implements ListarPessoaUseCasePort {

    private PessoaRepositoryPort repositoryPort;

    @Override
    public List<Pessoa> executar() {
        return repositoryPort.listar();
    }
}
