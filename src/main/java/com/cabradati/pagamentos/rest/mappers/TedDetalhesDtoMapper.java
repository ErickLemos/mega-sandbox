package com.cabradati.pagamentos.rest.mappers;

import com.cabradati.pagamentos.domain.pagamento.subtipos.ted.TedDetalhes;
import com.cabradati.pagamentos.rest.dtos.subtipos.ted.TedDetalhesDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
interface TedDetalhesDtoMapper {

    TedDetalhesDtoMapper INSTANCE = Mappers.getMapper(TedDetalhesDtoMapper.class);

    @Mapping(target = "chaveTed", source = "chaveTed")
    TedDetalhesDto mapFrom(TedDetalhes tedDetalhes);

}
