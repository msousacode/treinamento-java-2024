package org.example.polimorfismo.exercicio3.pedido;

import java.math.BigDecimal;
import java.util.List;

public abstract class Pedido {

    protected List<ItemPedido> itens;

    protected BigDecimal valorTotal;

    protected abstract void adicionarItem(ItemPedido itemPedido);

    protected abstract void calcularValorTotal();
}

