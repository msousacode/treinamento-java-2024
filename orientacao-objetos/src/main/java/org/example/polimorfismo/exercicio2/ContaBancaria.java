package org.example.polimorfismo.exercicio2;

import java.math.BigDecimal;

/**
 * <p>Classe Generica/ Classe Mãe / Super Classe</p>
 */
public abstract class ContaBancaria {

    protected String titular;

    protected BigDecimal saldo = BigDecimal.ZERO;

    public ContaBancaria(String titular, BigDecimal saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar(BigDecimal bigDecimal);

    public abstract void depositar(BigDecimal bigDecimal);

    public abstract BigDecimal exibirSaldo();

    public String getTitular() {
        return titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
