package de.aittr.g_31_2_security.repository;

import de.aittr.g_31_2_security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
