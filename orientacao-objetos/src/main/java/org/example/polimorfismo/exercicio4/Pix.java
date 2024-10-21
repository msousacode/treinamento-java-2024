package org.example.polimorfismo.exercicio4;

public class Pix extends Pagamento {

    private PagamentoBuilder builder;

    @Override
    protected void pagar(PagamentoBuilder pagamento) {
        System.out.println("\n\nPagar o pix");
        System.out.println("\n\n###############");
    }

    @Override
    protected void imprimirComprovante(PagamentoBuilder pagamento) {
        System.out.println("\n\nImprimir comprovante do pix");
        System.out.println("\n\n###############");
    }

    @Override
    protected void setPagamentoBuilder(PagamentoBuilder pagamento) {
        this.builder = pagamento;
    }

    @Override
    protected PagamentoBuilder getPagamentoBuilder() {
        return this.builder;
    }

}
