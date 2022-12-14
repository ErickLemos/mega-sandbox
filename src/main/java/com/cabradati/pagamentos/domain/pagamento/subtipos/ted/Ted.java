package com.cabradati.pagamentos.domain.pagamento.subtipos.ted;

import com.cabradati.pagamentos.domain.pagamento.Pagamento;
import com.cabradati.pagamentos.domain.pagamento.TipoDePagamento;
import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.PixDetalhes;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ted implements Pagamento {

    private UUID id;
    private TipoDePagamento tipo;
    private BigDecimal valor;
    private TedDetalhes detalhes;

}
