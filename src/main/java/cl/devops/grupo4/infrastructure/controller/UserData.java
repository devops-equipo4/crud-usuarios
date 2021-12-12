package cl.devops.grupo4.infrastructure.controller;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class UserData {

    private String name;
    private String lastName;
    private String user;
    @Email
    private String email;
    private String pass;
    private String rut;
}
