package com.cabradati.pagamentos.rest.dtos.subtipos.pix;

import com.cabradati.pagamentos.rest.dtos.PagamentoDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PixDto implements PagamentoDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("detalhes")
    private PixDetalhesDto detalhes;

}
