package com.ZeNobody.AuthSystem.domain.enums;

import jakarta.validation.ValidationException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;


@Getter
@AllArgsConstructor
public enum PermissaoEnum {

    USER(1, "Usuário"),
    ADM(2, "Administrador");

    private final Integer value;
    private final String descricao;

    public static PermissaoEnum getEnumByValue(Integer value) throws ValidationException {
        return Arrays.stream(PermissaoEnum.values())
                .filter(el -> el.getValue().equals(value))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(ErrosEnum.ERRO_PERMISSAO_NAO_ENCONTRADA.getDescricaoErro()));
    }
}



