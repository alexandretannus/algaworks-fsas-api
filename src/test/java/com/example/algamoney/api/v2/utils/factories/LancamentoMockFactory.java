package com.example.algamoney.api.v2.utils.factories;

import com.example.algamoney.api.v2.adapters.out.entity.LancamentoEntity;
import com.example.algamoney.api.v2.core.enums.TipoLancamento;
import com.example.algamoney.api.v2.core.model.Lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LancamentoMockFactory {

    public static LancamentoEntity obterLancamentoEntityMock() {
        return LancamentoEntity.builder()
                .codigo(123L)
                .tipo(TipoLancamento.DESPESA)
                .descricao("Água")
                .valor(BigDecimal.valueOf(200.50))
                .observacao("Acréscimo de 3.92 por multa")
                .categoria(CategoriaMockFactory.obterCategoriaEntityMock())
                .pessoa(PessoaMockFactory.getPessoaEntityMock())
                .dataVencimento(dateFromString("2022-08-20"))
                .dataPagamento(dateFromString("2022-08-12"))
                .build();
    }


    public static Lancamento obterLancamentoMock() {
        return Lancamento.builder()
                .codigo(123L)
                .tipo(TipoLancamento.DESPESA)
                .descricao("Água")
                .valor(BigDecimal.valueOf(200.50))
                .observacao("Acréscimo de 3.92 por multa")
                .categoria(CategoriaMockFactory.obterCategoriaMock())
                .pessoa(PessoaMockFactory.getPessoaMock())
                .dataVencimento(dateFromString("2022-08-20"))
                .dataPagamento(dateFromString("2022-08-12"))
                .build();
    }

    private static LocalDate dateFromString(String dateString) {
        return LocalDate.parse(dateString);
    }
}
