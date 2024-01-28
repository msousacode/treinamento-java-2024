package org.example.polimorfismo.exercicio2;

import java.math.BigDecimal;

/**
 * <p>Classe Concreta/ Sub-classe /Classe filha</p>
 */
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, BigDecimal saldo, BigDecimal taxaSaque) {
        super(titular, saldo);
        this.taxaSaque = taxaSaque;
    }

    private BigDecimal taxaSaque = new BigDecimal("2.00");

    public ContaCorrente(String titular, BigDecimal saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(BigDecimal valorSaque) {

        if (this.saldo.compareTo(valorSaque.add(taxaSaque)) < 0) {
            throw new RuntimeException("O saque não pode ser realizado pois o valor de saque é maior que o valor do saldo disponível");
        }

        this.saldo = this.saldo.subtract(valorSaque).subtract(taxaSaque);
    }

    @Override
    public void depositar(BigDecimal valorDeposito) {
        this.saldo = this.saldo.add(valorDeposito);
    }

    @Override
    public BigDecimal exibirSaldo() {
        return this.saldo;
    }

    public BigDecimal getTaxaSaque() {
        return taxaSaque;
    }

    public static ContaCorrente of(String titular, BigDecimal saldo) {
        return new ContaCorrente(titular, saldo);
    }
}
