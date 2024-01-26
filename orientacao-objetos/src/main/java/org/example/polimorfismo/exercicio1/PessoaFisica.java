package org.example.polimorfismo.exercicio1;

import java.math.BigDecimal;

public class PessoaFisica extends Contribuinte {

    private BigDecimal gastoSaude;

    private PessoaFisica(String nome, BigDecimal renda, BigDecimal gastoSaude) {
        super(nome, renda);
        this.gastoSaude = gastoSaude;
    }

    public BigDecimal getGastoSaude() {
        return gastoSaude;
    }

    public BigDecimal calcularImposto() {
        BigDecimal totalImpostoApagar = calcularTotalImpostoApagar();
        BigDecimal totalAbatimentoSaude = calcularAbatimentoGastoSaude();

        return totalImpostoApagar.subtract(totalAbatimentoSaude);
    }

    private BigDecimal calcularTotalImpostoApagar() {
        if (getRenda().compareTo(new BigDecimal("20000")) == -1) {
            return getRenda().multiply(new BigDecimal("0.15"));
        } else {
            return getRenda().multiply(new BigDecimal("0.25"));
        }
    }

    private BigDecimal calcularAbatimentoGastoSaude() {
        if (getGastoSaude().compareTo(BigDecimal.ZERO) == 1) {
            return getGastoSaude().divide(new BigDecimal("2"));
        }
        return BigDecimal.ZERO;
    }

    /**
     * <p>
     * A vantangem de usar método factory é que eles possuem nomes melhores do que os contrutores.
     *
     * </p>
     *
     * @param nome
     * @param renda
     * @param gastoSaude
     * @return
     */
    public static PessoaFisica of(String nome, BigDecimal renda, BigDecimal gastoSaude) {
        return new PessoaFisica(nome, renda, gastoSaude);
    }
}
