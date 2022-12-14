package com.cabradati.pagamentos.rest.dtos;

import com.cabradati.pagamentos.rest.dtos.subtipos.pix.PixDto;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(value = PixDto.class)})
public interface PagamentoDto {
}
