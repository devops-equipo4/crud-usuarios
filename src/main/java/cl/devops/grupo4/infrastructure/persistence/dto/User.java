package cl.devops.grupo4.infrastructure.persistence.dto;

import cl.devops.grupo4.infrastructure.controller.UserData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String user;
    @NotBlank(message = "Campo email es mandatorio")
    @Email
    private String email;
    private String pass;
    private String rut;

    public User(UserData userData) {
        this.name = userData.getName();
        this.lastName = userData.getLastName();
        this.user = userData.getUser();
        this.email = userData.getEmail();
        this.pass = userData.getPass();
        this.rut = userData.getRut();
    }

}
