package com.ZeNobody.AuthSystem.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PermissaoDTO {
    private int idPermissao;
    private String descricao;
}
