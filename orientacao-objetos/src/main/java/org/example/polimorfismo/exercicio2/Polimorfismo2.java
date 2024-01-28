package org.example.polimorfismo.exercicio2;

import org.example.util.FormatadorUtil;

import java.math.BigDecimal;

public class Polimorfismo2 {

    public static void main(String[] args) {

        try {
            ContaBancaria contaBancaria1 = ContaPoupanca.of("Maria Abreu", new BigDecimal("1000"));
            ContaBancaria contaBancaria2 = ContaCorrente.of("Felipe Abreu", new BigDecimal("1000"));

            contaBancaria1.sacar(new BigDecimal("500"));
            contaBancaria1.depositar(new BigDecimal("300"));

            contaBancaria2.sacar(new BigDecimal("500"));
            contaBancaria2.depositar(new BigDecimal("300"));

            imprimir(contaBancaria1);
            imprimir(contaBancaria2);

        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * <p>
     * Um exemplo do uso do polimorfismo, o método aceita uma super-classe e consegue
     * internamente aplicar lógicas espeficícas diferenciando as sub-classes e suas implementações.
     * </p>
     * @param contaBancaria
     */
    private static void imprimir(ContaBancaria contaBancaria) {

        if (contaBancaria instanceof ContaPoupanca) {

            System.out.println("\n== IMPRIMINDO DADOS DA CONTA POUPANÇA ==");
            System.out.println("Titular:" + contaBancaria.getTitular());
            System.out.println("Saldo atual: " + FormatadorUtil.formataMoedaBRL(contaBancaria.exibirSaldo()));

        } else if (contaBancaria instanceof ContaCorrente) {

            System.out.println("\n== IMPRIMINDO DADOS DA CONTA CORRENTE ==");
            System.out.println("Titular:" + contaBancaria.getTitular());
            System.out.println("Taxa por saque: " + ((ContaCorrente) contaBancaria).getTaxaSaque());//down cast
            System.out.println("Saldo atual: " + FormatadorUtil.formataMoedaBRL(contaBancaria.exibirSaldo()));
        }
    }
}
