package org.example.polimorfismo.exercicio3;

import org.example.polimorfismo.exercicio3.dominio.Bebida;
import org.example.polimorfismo.exercicio3.dominio.Comida;
import org.example.polimorfismo.exercicio3.pedido.ItemPedido;
import org.example.polimorfismo.exercicio3.pedido.Pedido;
import org.example.util.FormatadorUtil;

import java.math.BigDecimal;

public class Cliente {

    public static void main(String[] args) {

        ItemPedido itemPedido1 = Comida.of("Karê de frango", new BigDecimal("40"), 50);
        ItemPedido itemPedido2 = Bebida.of("Suco Laranja", new BigDecimal("5"), 10);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(itemPedido1);
        pedido.adicionarItem(itemPedido2);

        System.out.println("Total do pedido: " + FormatadorUtil.formataMoedaBRL(pedido.calcularValorTotal()));
    }
}
