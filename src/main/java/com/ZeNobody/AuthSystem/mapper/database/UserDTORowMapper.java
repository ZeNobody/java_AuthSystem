package com.ZeNobody.AuthSystem.mapper.database;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import lombok.SneakyThrows;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.time.LocalDateTime;


public class UserDTORowMapper implements RowMapper<UserDTO> {

    @Override
    @SneakyThrows
    public UserDTO map (ResultSet rs, StatementContext ctx){
        return UserDTO.builder()
                .idUsuario(rs.getLong("idUsuario"))
                .permissaoEnum(PermissaoEnum.getEnumByValue(rs.getInt("idPermissao")))
                .nomeUsuario(rs.getString("nomeUsuario"))
                .nuCpf(rs.getString("nuCpf"))
                .email(rs.getString("email"))
                .telefone(rs.getString("telefone"))
                .ativo("S".equalsIgnoreCase(rs.getString("ativo")))
                .dtInclusao(rs.getObject("dtInclusao", LocalDateTime.class))
                .build();
    }
}