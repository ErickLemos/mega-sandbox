package com.cabradati.pagamentos.rest.dtos.subtipos.pix;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PixDetalhesDto {

    @JsonProperty("chave_pix")
    private String chavePix;

}
