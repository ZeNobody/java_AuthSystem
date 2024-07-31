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

}



