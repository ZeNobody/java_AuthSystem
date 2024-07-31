package com.ZeNobody.AuthSystem.controller;

import com.codegen.rest.model.users.*;
import com.codegen.rest.api.users.V1Api;
import com.ZeNobody.AuthSystem.mapper.UserControllerMapper;
import com.ZeNobody.AuthSystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController implements V1Api {

    private final UserService userService;
    private final UserControllerMapper mapper;

    @Override
    public ResponseEntity<UserResponseRepresentation> createNewUser (@RequestBody NewUserPresentation request) {
        var service = userService.createUser(mapper.toUserDTO(request));
        return new ResponseEntity<>(mapper.toUserResponseRepresentation(service), HttpStatus.CREATED);
    }
}
