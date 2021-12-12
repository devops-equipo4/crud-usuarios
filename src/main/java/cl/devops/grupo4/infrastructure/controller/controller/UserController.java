package cl.devops.grupo4.infrastructure.controller.controller;

import cl.devops.grupo4.core.service.UserService;


import cl.devops.grupo4.infrastructure.controller.UserData;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
@Log4j
@Api(value = "Servicio de informacion usuarios")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> insertUser(@Valid @RequestBody UserData userData) {
        userService.create(userData);
        return new ResponseEntity("", HttpStatus.CREATED);
    }


}
