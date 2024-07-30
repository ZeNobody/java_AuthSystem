package com.ZeNobody.AuthSystem.mapper.database;


import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import lombok.SneakyThrows;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

@Component
public class UserDTOrowMapper implements RowMapper<UserDTO> {

    @Override
    @SneakyThrows
    public UserDTO map (ResultSet rs,  StatementContext ctx) {
        return UserDTO.builder()
                .idUsuario(rs.getLong("idUsuario"))
                .nomeUsuario(rs.getString("nomeUsuario"))
                .nuCpf(rs.getString("nuCpf"))
                .email(rs.getString("email"))
                .telefone(rs.getString("telefone"))
                .senha(rs.getString("senha"))
                .ativo(rs.getBoolean("ativo"))
                .permissaoEnum(PermissaoEnum.getEnumByValue(rs.getInt("idPermissao")))
                .build();
    }
}
