package cl.devops.grupo4.infrastructure.persistence.repository;

import cl.devops.grupo4.infrastructure.persistence.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
