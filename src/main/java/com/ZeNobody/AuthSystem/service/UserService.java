package com.ZeNobody.AuthSystem.service;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.domain.enums.ErrosEnum;
import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import com.ZeNobody.AuthSystem.repository.UserRepository;
import jakarta.validation.ValidationException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.util.Objects;

@Slf4j
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

    public UserDTO findUserByCpf (String cpf) {
        try{
            var user = userRepository.findUserByCpf(cpf);
            if (Objects.isNull(user)){
                throw new ValidationException(ErrosEnum.ERROR_NOT_FOUND.getDescricaoErro());
            }
            return user;
        } catch (Exception e) {
            log.error("Ocorreu um erro não mapeado, para o cpf: {} - erro: {}", cpf, e.getMessage(), e);
            throw new RuntimeException("Erro interno ao buscar usuário", e);
        }
    }
}