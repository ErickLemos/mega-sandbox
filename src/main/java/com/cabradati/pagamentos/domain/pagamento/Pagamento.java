package com.cabradati.pagamentos.domain.pagamento;

import java.math.BigDecimal;
import java.util.UUID;

public interface Pagamento {

    UUID getId();

    TipoDePagamento getTipo();

    BigDecimal getValor();

    PagamentoDetalhes getDetalhes();

}
