package com.example.algamoney.api.v2.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.PessoaEntity;
import com.example.algamoney.api.v2.core.model.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PessoaOutMapper{

    PessoaOutMapper INSTANCE = Mappers.getMapper(PessoaOutMapper.class);

    Pessoa toModel(PessoaEntity entity);

    PessoaEntity fromModel(Pessoa pessoa);
}
