package com.example.algamoney.api.v2.adapters.in.mapper;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.core.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaInMapper {
    CategoriaInMapper INSTANCE = Mappers.getMapper(CategoriaInMapper.class);

    Categoria fromDto(CategoriaDTO dto);

    CategoriaDTO toDto(Categoria model);

    List<CategoriaDTO> toDtoList(List<Categoria> model);

}
