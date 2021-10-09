package com.meli.ova_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewUser {

    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private Long number;
}
