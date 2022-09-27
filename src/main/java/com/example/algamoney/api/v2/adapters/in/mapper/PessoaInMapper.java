package com.example.algamoney.api.v2.adapters.in.mapper;

import com.example.algamoney.api.v2.adapters.in.dto.PessoaDTO;
import com.example.algamoney.api.v2.core.model.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PessoaInMapper {
    PessoaInMapper INSTANCE = Mappers.getMapper(PessoaInMapper.class);

    Pessoa fromDto(PessoaDTO dto);

    PessoaDTO toDto(Pessoa model);

    List<PessoaDTO> toDtoList(List<Pessoa> modelList);

}
