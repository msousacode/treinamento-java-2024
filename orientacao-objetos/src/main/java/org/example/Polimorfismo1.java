package org.example;

import org.example.polimorfismo.exercicio1.Contribuinte;
import org.example.polimorfismo.exercicio1.PessoaFisica;
import org.example.util.FormatadorUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Polimorfismo1 {

    public static void main(String[] args) {

        List<Contribuinte> contribuintes = new ArrayList();

        PessoaFisica pessoaFisica1 = PessoaFisica.of("Alex", new BigDecimal("50000.00"), new BigDecimal("2000.00"));
        PessoaFisica pessoaFisica2 = PessoaFisica.of("Bob", new BigDecimal("120000.00"), new BigDecimal("1000.00"));

        contribuintes.add(pessoaFisica1);
        contribuintes.add(pessoaFisica2);

        for (Contribuinte c : contribuintes) {
            System.out.println(String.format("Total de imposto a pagar: %s", FormatadorUtil.formataMoedaBRL(c.calcularImposto())));
        }
    }
}
