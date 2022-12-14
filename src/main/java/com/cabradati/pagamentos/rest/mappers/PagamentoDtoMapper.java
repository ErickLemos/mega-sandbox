package com.cabradati.pagamentos.rest.mappers;

import com.cabradati.pagamentos.core.utils.CommonsMapper;
import com.cabradati.pagamentos.domain.pagamento.Pagamento;
import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.Pix;
import com.cabradati.pagamentos.rest.dtos.PagamentoDto;
import com.cabradati.pagamentos.rest.dtos.subtipos.pix.PixDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        CommonsMapper.class,
        PixDetalhesDtoMapper.class
})
public interface PagamentoDtoMapper {

    PagamentoDtoMapper INSTANCE = Mappers.getMapper(PagamentoDtoMapper.class);

    @Mapping(target = "id", source = "id")
    PixDto mapFrom(Pix pix);

    default PagamentoDto mapFrom(Pagamento pagamento) {
        if (pagamento instanceof Pix) {
            return mapFrom((Pix) pagamento);
        }

        throw new IllegalArgumentException();
    }



}
