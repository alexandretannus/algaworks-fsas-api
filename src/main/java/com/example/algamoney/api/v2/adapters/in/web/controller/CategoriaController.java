package com.example.algamoney.api.v2.adapters.in.web.controller;

import com.example.algamoney.api.v2.adapters.in.dto.CategoriaInputDTO;
import com.example.algamoney.api.v2.adapters.in.mapper.CategoriaInMapper;
import com.example.algamoney.api.v2.adapters.in.service.CategoriaInService;
import com.example.algamoney.api.v2.adapters.in.dto.CategoriaDTO;
import com.example.algamoney.api.v2.core.model.Categoria;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v2/categorias")
public class CategoriaController {

    private CategoriaInService service;

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> listar() {
        List<CategoriaDTO> lista = service.listar();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  ResponseEntity<CategoriaDTO> salvar(@RequestBody @Valid CategoriaInputDTO inputDTO) {

        Categoria categoria = service.salvar(inputDTO);
        CategoriaDTO dto = CategoriaInMapper.INSTANCE.toDto(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
