package com.meli.ova_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioUpdate {
    private String name;
    private String surname;
    private String username;
    private String email;
    private Long number;
    private String password;
}
