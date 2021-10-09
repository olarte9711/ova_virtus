package com.meli.ova_api.service;

import com.meli.ova_api.dto.request.UsuarioUpdate;
import com.meli.ova_api.model.entities.Usuario;
import com.meli.ova_api.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;



    @Override
    public String createUser(Usuario user) {
        iUsuarioRepository.save(user);
        return "Creado satisfactoriamente";
    }

    @Override
    public Optional<Usuario> getUserById(Long userId) {
        Optional<Usuario> userResult = iUsuarioRepository.findById(userId);
        return userResult;
    }

    @Override
    public Optional<Usuario> getUserByUsername(String username) {
        Optional<Usuario> user = iUsuarioRepository.findByUsername(username);
        return user;
    }

    @Override
    public String deleteUser(Long userId) {
        iUsuarioRepository.deleteById(userId);
        return "Borrado";
    }

    @Override
    public String updateUser(Long userId, UsuarioUpdate userUpdateDTO) {
        Usuario user = iUsuarioRepository.getById(userId);
        user.setName(userUpdateDTO.getName());
        user.setSurname(userUpdateDTO.getSurname());
        user.setEmail(userUpdateDTO.getEmail());
        user.setPassword(userUpdateDTO.getPassword());
        user.setNumber(userUpdateDTO.getNumber());
        return "Actualizado";
    }

}