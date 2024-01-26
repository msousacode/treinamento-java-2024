package org.example.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatadorUtil {

    /**
     * <p>
     * O BigDecimal em Java representa números decimais de precisão arbitrária, mas ele não tem conhecimento sobre a moeda associada.
     * A formatação da moeda, incluindo o símbolo da moeda, geralmente é tratada quando você exibe os valores, não no próprio BigDecimal.
     * </p>
     *
     * @param valorMonetario
     * @return
     */
    public static String formataMoedaBRL(BigDecimal valorMonetario) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatoMoeda.format(valorMonetario);
    }
}
