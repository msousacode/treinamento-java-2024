package org.example.polimorfismo.exercicio2;

import java.math.BigDecimal;

/**
 * <p>Classe Concreta/ Sub-classe /Classe filha</p>
 */
public class ContaPoupanca extends ContaBancaria {

    private BigDecimal taxaRendimento;

    @Override
    public void sacar(BigDecimal bigDecimal) {

    }

    @Override
    public void depositar(BigDecimal bigDecimal) {

    }

    @Override
    public void exibirSaldo() {

    }

    public BigDecimal getTaxaRendimento() {
        return taxaRendimento;
    }
}
