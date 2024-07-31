package com.ZeNobody.AuthSystem.repository.impl;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.repository.UserRepository;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

@UseClasspathSqlLocator
public interface UserRepositoryImpl extends UserRepository {

    @Override
    @SqlUpdate
    @GetGeneratedKeys
    Long createUser(@BindBean UserDTO user);
}
