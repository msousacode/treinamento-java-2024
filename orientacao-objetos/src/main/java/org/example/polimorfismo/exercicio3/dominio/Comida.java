package org.example.polimorfismo.exercicio3.dominio;

import org.example.polimorfismo.exercicio3.pedido.ItemPedido;

import java.math.BigDecimal;

public class Comida extends ItemPedido {

    private double tempoPreparo;

    public Comida(String nome, BigDecimal preco, double tempoPreparo) {
        super(nome, preco);
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    protected BigDecimal calculaPreco(int quantidade) {
        return null;
    }
}
