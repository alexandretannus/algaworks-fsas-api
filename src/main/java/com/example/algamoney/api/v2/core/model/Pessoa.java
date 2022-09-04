package com.example.algamoney.api.v2.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pessoa {

	private Long codigo;

	@NotNull
	private String nome;

	private Endereco endereco;

	@NotNull
	private Boolean ativo;

	public boolean isInativo() {
		return !this.ativo;
	}


}
