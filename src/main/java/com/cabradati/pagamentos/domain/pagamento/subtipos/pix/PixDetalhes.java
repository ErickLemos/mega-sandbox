package com.cabradati.pagamentos.domain.pagamento.subtipos.pix;

import com.cabradati.pagamentos.domain.pagamento.PagamentoDetalhes;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PixDetalhes implements PagamentoDetalhes {

    private String chavePix;

}
