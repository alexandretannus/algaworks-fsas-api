package com.example.algamoney.api.v2.adapters.in.web.controller;


import com.example.algamoney.api.v2.adapters.in.dto.PessoaDTO;
import com.example.algamoney.api.v2.adapters.in.service.PessoaInService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v2/pessoas")
public class PessoaController {

    private PessoaInService service;

    @GetMapping
    public ResponseEntity<List<PessoaDTO>> listar() {
        List<PessoaDTO> pessoas = service.listar();

        return ResponseEntity.ok(pessoas);

    }
}
