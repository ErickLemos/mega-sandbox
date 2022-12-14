package com.cabradati.pagamentos.rest.mappers;

import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.PixDetalhes;
import com.cabradati.pagamentos.rest.dtos.subtipos.pix.PixDetalhesDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
interface PixDetalhesDtoMapper {

    PixDetalhesDtoMapper INSTANCE = Mappers.getMapper(PixDetalhesDtoMapper.class);

    @Mapping(target = "chavePix", source = "chavePix")
    PixDetalhesDto mapFrom(PixDetalhes pixDetalhes);

}
