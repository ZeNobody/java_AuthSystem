package com.ZeNobody.AuthSystem.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrosEnum {

    ERROR_NOT_FOUND("Não foi possível encontrar o caminho solicitado", HttpStatus.NOT_FOUND),
    ERROR_INTERNAL_SERVER("Erro interno!", HttpStatus.INTERNAL_SERVER_ERROR),
    ERRO_PERMISSAO_NAO_ENCONTRADA("Permissão não encontrada", HttpStatus.INTERNAL_SERVER_ERROR);
    //ADICIONAR ERROS


    private final String descricaoErro;
    private final HttpStatus codigoHttp;

}
