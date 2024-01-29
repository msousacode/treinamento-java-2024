package org.example.polimorfismo.exercicio3.pedido;

import java.math.BigDecimal;

public abstract class ItemPedido {

    protected String nome;

    protected BigDecimal preco;

    protected abstract BigDecimal calculaPreco(int quantidade);

    public ItemPedido(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
