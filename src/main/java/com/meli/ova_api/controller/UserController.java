package com.meli.ova_api.controller;

import com.meli.ova_api.dto.request.UsuarioUpdate;
import com.meli.ova_api.model.entities.Usuario;
import com.meli.ova_api.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("ova-ud/user")
@CrossOrigin("*")
@AllArgsConstructor
public class UserController {
    private IUserService iUserService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody Usuario user) {
        return new ResponseEntity<>(iUserService.createUser(user), HttpStatus.CREATED);
    }
    @PostMapping("/update/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody UsuarioUpdate userUpdateDTO) {
        return new ResponseEntity<>(iUserService.updateUser(userId, userUpdateDTO), HttpStatus.OK);
    }
    @DeleteMapping("/delete-user/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId){
        return new ResponseEntity<>(iUserService.deleteUser(userId), HttpStatus.OK);
    }

    @GetMapping("/get-by-id/{userId}")
    public ResponseEntity<Optional<Usuario>> getUserById(@PathVariable Long userId) {
        return new ResponseEntity<>(iUserService.getUserById(userId), HttpStatus.OK);
    }
    @GetMapping("get-by-username/{username}")
    public ResponseEntity<Optional<Usuario>> getUserByUsername(@PathVariable String username) {
        return new ResponseEntity<>(iUserService.getUserByUsername(username), HttpStatus.OK);
    }

}