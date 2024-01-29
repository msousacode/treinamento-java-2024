package org.example.polimorfismo.exercicio3.dominio;

import org.example.polimorfismo.exercicio3.pedido.ItemPedido;

import java.math.BigDecimal;

public class Bebida extends ItemPedido {

    private double volume;

    public Bebida(String nome, BigDecimal preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    @Override
    protected BigDecimal calculaPreco(int quantidade) {
        return null;
    }
}
