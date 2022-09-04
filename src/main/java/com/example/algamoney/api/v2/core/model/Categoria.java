package com.example.algamoney.api.v2.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Categoria {
    private Long codigo;

    @NotNull
    @Size(min = 3, max = 20)
    private String nome;
}
