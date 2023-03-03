package ro.rarom.varianteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.rarom.varianteApp.entity.user.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
