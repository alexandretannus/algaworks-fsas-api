package com.example.algamoney.api.v2.adapters.in.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PessoaDTO {
    private Long codigo;

    private String nome;

    private EnderecoDTO endereco;

    private Boolean ativo;

}
