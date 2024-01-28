package org.example.polimorfismo.exercicio2;

import java.math.BigDecimal;

/**
 * <p>Classe Concreta/ Sub-classe /Classe filha</p>
 */
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, BigDecimal saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(BigDecimal valorSaque) {
        this.saldo = this.saldo.subtract(valorSaque);
    }

    @Override
    public void depositar(BigDecimal valorDeposito) {
        this.saldo = this.saldo.add(valorDeposito);
    }

    @Override
    public BigDecimal exibirSaldo() {
        return this.saldo;
    }

    public static ContaPoupanca of(String titular, BigDecimal saldoInicial) {
        return new ContaPoupanca(titular, saldoInicial);
    }
}
