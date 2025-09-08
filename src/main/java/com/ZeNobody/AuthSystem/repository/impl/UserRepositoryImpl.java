package com.ZeNobody.AuthSystem.repository.impl;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.mapper.database.UserDTORowMapper;
import com.ZeNobody.AuthSystem.repository.UserRepository;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

@UseClasspathSqlLocator
public interface UserRepositoryImpl extends UserRepository {

    @Override
    @SqlUpdate
    @GetGeneratedKeys
    Long createUser(@BindBean UserDTO user);

    @Override
    @SqlQuery
    @UseRowMapper(UserDTORowMapper.class)
    UserDTO findUserByCpf(String cpf);
}
