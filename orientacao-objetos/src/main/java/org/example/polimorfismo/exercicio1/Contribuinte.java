package org.example.polimorfismo.exercicio1;

import java.math.BigDecimal;

/**
 * <p>
 * Essa classe é a generalização das classes Pessoa Física e Pessoa Jurídica.
 * Pensando na orientação à objetos será necessário implementar a herança.
 * Pois as classes mais especializadas possuem implementação de cálculo diferentes,
 * porém comportilham de alguns atributos comum a ambas.
 * </p>
 */
public abstract class Contribuinte {

    private String nome;

    /**
     * <p>
     * Ao lidar com valores monetários é recomendado utilizar tipos seguros para representar tipos monetários.
     * O uso do BigDecimal ajuda a evitar problemas de arredondamento com tipos de pontos flutuantes como 'float' e 'double'
     * </p>
     */
    private BigDecimal renda;

    protected Contribuinte(String nome, BigDecimal renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    /**
     * <p>
     * Ao definir o método como abstrato torno possível que
     * as sub-classes definam a implementação da lógica a ser
     * executada no método calcularImposto()
     * </p>
     */
    public abstract BigDecimal calcularImposto();
}
