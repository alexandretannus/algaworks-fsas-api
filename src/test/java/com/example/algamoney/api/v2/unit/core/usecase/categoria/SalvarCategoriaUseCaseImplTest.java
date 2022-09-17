package com.example.algamoney.api.v2.unit.core.usecase.categoria;

import com.example.algamoney.api.v2.core.model.Categoria;
import com.example.algamoney.api.v2.core.usecase.categoria.SalvarCategoriaUseCaseImpl;
import com.example.algamoney.api.v2.ports.out.CategoriaRepositoryPort;
import com.example.algamoney.api.v2.utils.factories.CategoriaMockFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.MockitoAnnotations.openMocks;

class SalvarCategoriaUseCaseImplTest {

    @InjectMocks
    private SalvarCategoriaUseCaseImpl useCase;

    @Mock
    private CategoriaRepositoryPort repository;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void executar() {
        Categoria categoria = CategoriaMockFactory.obterCategoriaMock();
        Categoria categoriaSemId = CategoriaMockFactory.obterCategoriaMock();
        categoriaSemId.setCodigo(null);

        Mockito.when(repository.salvar(categoriaSemId)).thenReturn(categoria);

        Categoria categoriaRetornada = useCase.executar(categoriaSemId);

        assertNotNull(categoriaRetornada);
        assertNotNull(categoriaRetornada.getCodigo());
        assertEquals(categoriaRetornada.getNome(), categoriaSemId.getNome());
    }
}