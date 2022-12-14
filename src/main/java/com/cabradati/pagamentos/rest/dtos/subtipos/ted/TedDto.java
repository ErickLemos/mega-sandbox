package com.cabradati.pagamentos.rest.dtos.subtipos.ted;

import com.cabradati.pagamentos.rest.dtos.PagamentoDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TedDto implements PagamentoDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("detalhes")
    private TedDetalhesDto detalhes;

}
