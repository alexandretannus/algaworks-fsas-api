package com.example.algamoney.api.v2.adapters.in.service;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.adapters.in.dto.CategoriaInputDTO;
import com.example.algamoney.api.v2.adapters.in.mapper.CategoriaInMapper;
import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.ports.in.categoria.ListarCategoriaUseCasePort;
import com.example.algamoney.api.v2.ports.in.categoria.SalvarCategoriaUseCasePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class CategoriaInService {

    private ListarCategoriaUseCasePort listarCategoriaUseCasePort;
    private SalvarCategoriaUseCasePort salvarCategoriaUseCasePort;

    public List<CategoriaDTO> listar() {
        List<Categoria> lista = listarCategoriaUseCasePort.executar();

        return CategoriaInMapper.INSTANCE.toDtoList(lista);
    }

    public Categoria salvar(CategoriaInputDTO inputDTO) {
        Categoria categoria = CategoriaInMapper.INSTANCE.fromInputDTO(inputDTO);
        return salvarCategoriaUseCasePort.executar(categoria);
    }
}
