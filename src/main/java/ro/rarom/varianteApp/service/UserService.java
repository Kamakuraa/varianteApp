package ro.rarom.varianteApp.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Service;
import ro.rarom.varianteApp.entity.user.UserEntity;
import ro.rarom.varianteApp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository repository;


  public List<UserEntity> getAll() {
    return repository.findAll();
  }

  public Optional<UserEntity> getUserById(int userId) {
    return repository.findById(userId);
  }

  public UserEntity addUserEntity(UserEntity user) {
    return repository.save(user);
  }

  public UserEntity deleteUserById(int userId) {
    Optional<UserEntity> inventory = repository.findById(userId);
    inventory.ifPresent(repository::delete);

    return inventory.orElse(null);

  }
}
