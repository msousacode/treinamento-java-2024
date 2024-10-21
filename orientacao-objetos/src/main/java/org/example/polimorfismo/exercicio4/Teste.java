package org.example.polimorfismo.exercicio4;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Teste {

    public static void main(String[] args) {

        ProcessaPagamento processaPagamento = new ProcessaPagamento();// É como se fosse um maquininha que processa
                                                                      // vários pagamentos.

        Pagamento pagamentoBoleto = new Boleto();
        PagamentoBuilder pagamentoBoletoBuilder = new PagamentoBuilder(LocalDateTime.now(), BigDecimal.TEN);

        pagamentoBoleto.setPagamentoBuilder(pagamentoBoletoBuilder);

        // Processar pagamento boleto
        processaPagamento.processar(pagamentoBoleto);

        Pagamento pagamentoPix = new Pix();
        PagamentoBuilder pixBuilder = new PagamentoBuilder(LocalDateTime.now(), new BigDecimal("10"));

        pagamentoPix.setPagamentoBuilder(pixBuilder);

        // Processar pagamento boleto
        processaPagamento.processar(pagamentoPix);
    }
}
