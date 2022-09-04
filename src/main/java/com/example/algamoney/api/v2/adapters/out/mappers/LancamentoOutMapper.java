package com.example.algamoney.api.v2.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.LancamentoEntity;
import com.example.algamoney.api.v2.core.model.Lancamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LancamentoOutMapper {

    LancamentoOutMapper INSTANCE = Mappers.getMapper(LancamentoOutMapper.class);

    Lancamento toModel(LancamentoEntity entity);

    LancamentoEntity fromModel(Lancamento lancamento);
}
