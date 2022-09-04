package com.example.algamoney.api.v2.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoLancamento {

	RECEITA("Receita"),
	DESPESA("Despesa");

	private final String tipoLancamento;
	
}
