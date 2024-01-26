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
        if (quantidadeFuncionarios.compareTo(10) == 1) {
            return getRenda().multiply(new BigDecimal("0.14"));
        } else {
            return getRenda().multiply(new BigDecimal("0.16"));
        }
    }

    public static PessoaJuridica of(String nome, BigDecimal renda, Integer quantidadeFuncionarios) {
        return new PessoaJuridica(nome, renda, quantidadeFuncionarios);
    }
}
