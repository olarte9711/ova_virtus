package com.meli.ova_api.service;

import com.meli.ova_api.dto.request.UsuarioUpdate;
import com.meli.ova_api.model.entities.Usuario;

import java.util.Optional;

public interface IUserService {
    String createUser(Usuario user);

    Optional<Usuario> getUserById(Long userId);

    Optional<Usuario> getUserByUsername(String username);

    String deleteUser(Long userId);

    String updateUser(Long userId, UsuarioUpdate userUpdateDTO);
}
