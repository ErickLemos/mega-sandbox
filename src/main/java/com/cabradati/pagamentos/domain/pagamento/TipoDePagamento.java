package com.cabradati.pagamentos.domain.pagamento;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum TipoDePagamento {
    PIX("pix");

    private final String valor;

    public TipoDePagamento entryOf(String valor) {
        return Arrays.stream(values())
                .filter(item -> item.valor.equals(valor))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
