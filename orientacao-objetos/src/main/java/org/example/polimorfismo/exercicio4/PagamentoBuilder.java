package org.example.polimorfismo.exercicio4;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PagamentoBuilder {

    private LocalDateTime dataPagamento;

    private BigDecimal valor;

    public PagamentoBuilder(LocalDateTime dataPagamento, BigDecimal valor) {
        this.dataPagamento = dataPagamento;
        this.valor = valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public static PagamentoBuilder getInstance(LocalDateTime dataPagamento, BigDecimal valor) {

        if (dataPagamento == null || valor == null) {
            throw new RuntimeException("Os atributos do pagamento não estão corretos.");
        }
        return new PagamentoBuilder(dataPagamento, valor);
    }
}
