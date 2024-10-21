package org.example.polimorfismo.exercicio4;

public class ProcessaPagamento {

    public void processar(Pagamento pagamento) {
        validar(pagamento);
        pagamento.pagar(pagamento.getPagamentoBuilder());
        pagamento.imprimirComprovante(pagamento.getPagamentoBuilder());
    }

    public void validar(Pagamento pagamento) {
        if (pagamento == null) {
            throw new RuntimeException("Pagamento não pode ser null.");
        }

        if (pagamento.getPagamentoBuilder() == null) {
            throw new RuntimeException("PagamentoBuilder não pode ser null.");
        }
    }
}
