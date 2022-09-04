package com.example.algamoney.api.v2.adapters.out.mappers;

import com.example.algamoney.api.v2.adapters.out.entity.CategoriaEntity;
import com.example.algamoney.api.v2.core.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoriaOutMapper {

    CategoriaOutMapper INSTANCE = Mappers.getMapper(CategoriaOutMapper.class);

    Categoria toModel(CategoriaEntity entity);

    CategoriaEntity fromModel(Categoria categoria);
}
