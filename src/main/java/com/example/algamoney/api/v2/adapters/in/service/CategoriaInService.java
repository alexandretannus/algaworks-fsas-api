package com.example.algamoney.api.v2.adapters.in.service;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.in.mapper.CategoriaInMapper;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.ports.in.categoria.ListarCategoriaUseCasePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class CategoriaInService {

    private ListarCategoriaUseCasePort listarCategoriaUseCasePort;

    public List<CategoriaDTO> listar() {
        List<Categoria> lista = listarCategoriaUseCasePort.executar();

        return CategoriaInMapper.INSTANCE.toDtoList(lista);
    }
}
