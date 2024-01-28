package org.example.polimorfismo.exercicio2;

import java.math.BigDecimal;

/**
 * <p>Classe Concreta/ Sub-classe /Classe filha</p>
 */
public class ContaCorrente extends ContaBancaria {

    private BigDecimal limiteChequeEspecial;

    @Override
    public void sacar(BigDecimal bigDecimal) {

    }

    @Override
    public void depositar(BigDecimal bigDecimal) {

    }

    @Override
    public void exibirSaldo() {

    }

    public BigDecimal getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
