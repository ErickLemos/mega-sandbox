package com.cabradati.pagamentos.domain.pagamento.subtipos.ted;

import com.cabradati.pagamentos.domain.pagamento.PagamentoDetalhes;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TedDetalhes implements PagamentoDetalhes {

    private String chaveTed;

}
