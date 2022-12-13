package com.cabradati.pagamentos.domain.pagamento.subtipos.pix;

import com.cabradati.pagamentos.domain.pagamento.Pagamento;
import com.cabradati.pagamentos.domain.pagamento.TipoDePagamento;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pix implements Pagamento {

    private UUID id;
    private TipoDePagamento tipo;
    private BigDecimal valor;
    private PixDetalhes detalhes;

}
