package org.example.polimorfismo.exercicio3.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    protected List<ItemPedido> itens = new ArrayList<>();

    protected BigDecimal valorTotal = BigDecimal.ZERO;

    public void adicionarItem(ItemPedido itemPedido) {
        this.itens.add(itemPedido);
    }

    public BigDecimal calcularValorTotal() {

        for (ItemPedido i : itens) {
            this.valorTotal = this.valorTotal.add(i.getPreco());
        }
        return this.valorTotal;
    }
}

