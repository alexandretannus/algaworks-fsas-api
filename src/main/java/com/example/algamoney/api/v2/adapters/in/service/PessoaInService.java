package com.example.algamoney.api.v2.adapters.in.service;

import com.example.algamoney.api.v2.adapters.in.dto.PessoaDTO;
import com.example.algamoney.api.v2.adapters.in.mapper.PessoaInMapper;
import com.example.algamoney.api.v2.core.model.Pessoa;
import com.example.algamoney.api.v2.ports.in.pessoa.ListarPessoaUseCasePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class PessoaInService {

    private ListarPessoaUseCasePort listarPessoaUseCasePort;

    public List<PessoaDTO> listar() {
        List<Pessoa> lista = listarPessoaUseCasePort.executar();

        return PessoaInMapper.INSTANCE.toDtoList(lista);
    }
}
