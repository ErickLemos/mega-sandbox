package com.cabradati.pagamentos.rest.controllers;

import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.Pix;
import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.PixDetalhes;
import com.cabradati.pagamentos.rest.dtos.PagamentoDto;
import com.cabradati.pagamentos.rest.mappers.PagamentoDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("pagamentos")
public class PagamentoController {

    @GetMapping
    public ResponseEntity<PagamentoDto> get() {

        var pix = Pix.builder()
                .id(UUID.randomUUID())
                .detalhes(PixDetalhes.builder().chavePix("SADASDSADAD").build())
                .build();

        var dto = PagamentoDtoMapper.INSTANCE.mapFrom(pix);

        return ResponseEntity.ok(dto);

    }

}
