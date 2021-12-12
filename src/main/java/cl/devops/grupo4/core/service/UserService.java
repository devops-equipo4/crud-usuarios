package cl.devops.grupo4.core.service;

import cl.devops.grupo4.infrastructure.controller.UserData;
import cl.devops.grupo4.infrastructure.persistence.dto.User;
import cl.devops.grupo4.infrastructure.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<?> create(UserData userData) {
        userRepository.save(new User(userData));
        return new ResponseEntity("", HttpStatus.CREATED);

    }

}
