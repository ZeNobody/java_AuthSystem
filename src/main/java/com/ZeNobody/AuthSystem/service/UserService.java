package com.ZeNobody.AuthSystem.service;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import com.ZeNobody.AuthSystem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserDTO createUser (UserDTO user) {
            user.setPermissaoEnum(PermissaoEnum.USER);
            user.setAtivo(true);
            user.setDtInclusao(LocalDateTime.now());
            user.setIdUsuario(userRepository.createUser(user));
            return user;
    }
}
