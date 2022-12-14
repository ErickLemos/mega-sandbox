package com.cabradati.pagamentos.rest.dtos.subtipos.ted;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TedDetalhesDto {

    @JsonProperty("chave_ted")
    private String chaveTed;

}
