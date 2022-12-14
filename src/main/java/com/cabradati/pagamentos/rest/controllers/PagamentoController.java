package com.cabradati.pagamentos.rest.controllers;

import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.Pix;
import com.cabradati.pagamentos.domain.pagamento.subtipos.pix.PixDetalhes;
import com.cabradati.pagamentos.domain.pagamento.subtipos.ted.Ted;
import com.cabradati.pagamentos.domain.pagamento.subtipos.ted.TedDetalhes;
import com.cabradati.pagamentos.rest.dtos.PagamentoDto;
import com.cabradati.pagamentos.rest.mappers.PagamentoDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
@RequestMapping("pagamentos")
public class PagamentoController {

    @GetMapping
    public ResponseEntity<List<PagamentoDto>> get() {

        var pix = Pix.builder()
                .id(UUID.randomUUID())
                .detalhes(PixDetalhes.builder().chavePix("SADASDSADAD").build())
                .build();

        var ted = Ted.builder()
                .id(UUID.randomUUID())
                .detalhes(TedDetalhes.builder().chaveTed("ASDASDASDASD").build())
                .build();

        var listaDtos = Stream.of(ted, pix)
                .map(PagamentoDtoMapper.INSTANCE::mapFrom)
                .toList();

        return ResponseEntity.ok(listaDtos);

    }

}
