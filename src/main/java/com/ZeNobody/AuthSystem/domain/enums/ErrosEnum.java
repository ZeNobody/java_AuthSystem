package com.ZeNobody.AuthSystem.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrosEnum {

    ERRO_NOT_FOUND("Não foi possível encontrar o caminho solicitado", HttpStatus.NOT_FOUND);
    //ADICIONAR ERROS


    private final String descricaoErro;
    private final HttpStatus codigoHttp;

}
