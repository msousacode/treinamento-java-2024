package org.example.polimorfismo.exercicio1;

import java.math.BigDecimal;

public class PessoaJuridica extends Contribuinte {

    private Integer quantidadeFuncionarios;

    public PessoaJuridica(String nome, BigDecimal renda, Integer quantidadeFuncionarios) {
        super(nome, renda);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public BigDecimal calcularImposto() {
        return BigDecimal.ZERO;
    }
}
