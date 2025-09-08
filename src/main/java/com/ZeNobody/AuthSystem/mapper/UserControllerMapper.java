package com.ZeNobody.AuthSystem.mapper;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import com.ZeNobody.AuthSystem.utils.DataUtil;
import com.codegen.rest.model.users.NewUserPresentation;
import com.codegen.rest.model.users.PermissaoUserRepresentation;
import com.codegen.rest.model.users.UserCPFResponseRepresentation;
import com.codegen.rest.model.users.UserResponseRepresentation;
import org.springframework.stereotype.Component;

@Component
public class UserControllerMapper {

    public UserDTO toUserDTO (NewUserPresentation rs) {
        return UserDTO.builder()
                .nomeUsuario(rs.getNomeUsuario())
                .nuCpf(rs.getNuCpf())
                .email(rs.getEmail())
                .telefone(rs.getTelefone())
                .senha(rs.getSenha())
                .build();
    }

    public UserResponseRepresentation toUserResponseRepresentation (UserDTO user) {
        var response = new UserResponseRepresentation();
        response.setIdUsuario(user.getIdUsuario());
        response.setNome(user.getNomeUsuario());
        response.setCpf(user.getNuCpf());
        response.setEmail(user.getEmail());
        response.setTelefone(user.getTelefone());
        response.setPermissao(toPermissaoUserRepresentation(user.getPermissaoEnum()));
        response.setAtivo(true);
        response.setDtInclusao(DataUtil.formatLocalDateTime(user.getDtInclusao()));
        return response;
    }

    public PermissaoUserRepresentation toPermissaoUserRepresentation(PermissaoEnum permissao) {
        var response = new PermissaoUserRepresentation();
        response.setIdPermissao(permissao.getValue());
        response.setDescricao(permissao.getDescricao());
        return response;
    }

    public UserCPFResponseRepresentation toUserCPFResponseRepresentation (UserDTO user) {
        var response = new UserCPFResponseRepresentation();
        response.setIdUsuario(user.getIdUsuario());
        response.setNome(user.getNomeUsuario());
        response.setCpf(user.getNuCpf());
        response.setEmail(user.getEmail());
        response.setTelefone(user.getTelefone());
        response.setPermissao(toPermissaoUserRepresentation(user.getPermissaoEnum()));
        response.setAtivo(true);
        response.setDtInclusao(DataUtil.formatLocalDateTime(user.getDtInclusao()));
        return response;
    }
}
