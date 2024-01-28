package org.example.polimorfismo.exercicio2;

import java.math.BigDecimal;

/**
 * <p>Classe Generica</p>
 */
public abstract class ContaBancaria {

    protected String titular;

    protected BigDecimal saldo;

    public abstract void sacar(BigDecimal bigDecimal);

    public abstract void depositar(BigDecimal bigDecimal);

    public abstract void exibirSaldo();

    public String getTitular() {
        return titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
