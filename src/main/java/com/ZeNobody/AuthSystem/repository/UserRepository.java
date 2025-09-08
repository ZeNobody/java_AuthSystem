package com.ZeNobody.AuthSystem.repository;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;

public interface UserRepository {

    Long createUser (UserDTO user);

    UserDTO findUserByCpf(String cpf);
}
