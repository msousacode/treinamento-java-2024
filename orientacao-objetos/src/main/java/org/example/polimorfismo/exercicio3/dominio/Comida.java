package org.example.polimorfismo.exercicio3.dominio;

import org.example.polimorfismo.exercicio3.pedido.ItemPedido;

import java.math.BigDecimal;

/**
 * <p>
 * Para mim não faz sentido existir essa classe Bebida e a Comida, pois ambas são identicas e não
 * tem comportamento diferentes que justifique o uso de polimorfismo.
 * </p>
 */
public class Comida extends ItemPedido {

    private double tempoPreparo;//única propriedade diferente do objeto Bebida.

    public Comida(String nome, BigDecimal preco, double tempoPreparo) {
        super(nome, preco);
        this.tempoPreparo = tempoPreparo;
    }

    public static Comida of(String nome, BigDecimal preco, double tempoPreparo) {
        return new Comida(nome, preco, tempoPreparo);
    }

    public double getTempoPreparo() {
        return tempoPreparo;
    }
}
