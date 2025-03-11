package dpacoladev.com.github.simple_library.repositories;

import dpacoladev.com.github.simple_library.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    String findByLogin(String login);
}
