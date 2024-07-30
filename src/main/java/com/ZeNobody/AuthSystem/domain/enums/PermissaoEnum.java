package com.ZeNobody.AuthSystem.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum PermissaoEnum {

    USER(1, "Usuário"),
    ADM(2, "Administrador");

    private final Integer value;
    private final String descricao;

    public static PermissaoEnum getEnumByValue(Integer value) {
        for (PermissaoEnum permissao : values()) {
            if (permissao.getValue().equals(value)) {
                return permissao;
            }
        }
        throw new IllegalArgumentException("No enum constant with value " + value);
    }
}



