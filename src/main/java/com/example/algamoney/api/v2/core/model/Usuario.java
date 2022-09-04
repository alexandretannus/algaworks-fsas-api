package com.example.algamoney.api.v2.core.model;

import com.example.algamoney.api.model.Permissao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Usuario {

	private Long codigo;
	private String nome;
	private String email;
	private String senha;
	private List<Permissao> permissoes;

}
