package org.example.polimorfismo.exercicio4;

public abstract class Pagamento {

    protected abstract void pagar(PagamentoBuilder pagamento);

    protected abstract void imprimirComprovante(PagamentoBuilder pagamento);

    protected abstract void setPagamentoBuilder(PagamentoBuilder pagamento);

    protected abstract PagamentoBuilder getPagamentoBuilder();
}
