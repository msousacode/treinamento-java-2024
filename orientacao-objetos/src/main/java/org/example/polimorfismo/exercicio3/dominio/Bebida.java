package org.example.polimorfismo.exercicio3.dominio;

import org.example.polimorfismo.exercicio3.pedido.ItemPedido;

import java.math.BigDecimal;

/**
 * <p>
 * Para mim não faz sentido existir essa classe Bebida e a Comida, pois ambas são identicas e não
 * tem comportamento diferentes que justifique o uso de polimorfismo.
 * </p>
 */
public class Bebida extends ItemPedido {

    private double volume;//única propriedade diferente da classe Comida

    public Bebida(String nome, BigDecimal preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    public static Comida of(String nome, BigDecimal preco, double volume) {
        return new Comida(nome, preco, volume);
    }

    public double getVolume() {
        return volume;
    }
}
