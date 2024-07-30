package com.ZeNobody.AuthSystem.domain.dto;

import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class UserDTO {

    private Long idUsuario;
    private PermissaoEnum permissaoEnum;
    private String nomeUsuario;
    private String nuCpf;
    private String email;
    private String telefone;
    private String senha;
    private boolean ativo;
    private LocalDateTime dtInclusao;
}
