package com.cabradati.pagamentos.core.utils;

import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper
public interface CommonsMapper {

    default String mapFrom(UUID uuid) {
        return uuid.toString();
    }

}
