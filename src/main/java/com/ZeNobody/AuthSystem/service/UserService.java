package com.ZeNobody.AuthSystem.service;

import com.ZeNobody.AuthSystem.domain.dto.UserDTO;
import com.ZeNobody.AuthSystem.domain.enums.PermissaoEnum;
import com.ZeNobody.AuthSystem.mapper.database.UserDTOrowMapper;
import com.ZeNobody.AuthSystem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserDTOrowMapper mapper;

    @Transactional
    public UserDTO createUser (UserDTO user) {
//        try{
            user.setPermissaoEnum(PermissaoEnum.USER); // Padrão USUÁRIO
            user.setAtivo(true); // Padrão como true > ativo
            user.setDtInclusao(LocalDateTime.now()); //Adicionar hora atual da requisição > corrigir utc
            user.setIdUsuario(userRepository.createUser(user));
            return user;
//        } catch (Exception e) {
//            throw new RuntimeException(ErrosEnum.ERRO_NOT_FOUND.getDescricaoErro()); //Corrigir erro
//        }
    }

}
