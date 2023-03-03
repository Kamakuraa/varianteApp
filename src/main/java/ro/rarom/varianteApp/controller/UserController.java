package ro.rarom.varianteApp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.rarom.varianteApp.entity.user.UserEntity;
import ro.rarom.varianteApp.exception.ResourceNotFoundException;
import ro.rarom.varianteApp.service.UserService;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

  private final UserService service;

  @GetMapping
  List<UserEntity> getAll() {
    return service.getAll();
  }

  @GetMapping("{userId}")
  UserEntity getUserById(@PathVariable int userId) {
    return service.getUserById(userId)
      .orElseThrow(() -> new ResourceNotFoundException("Could not find user with id " + userId));
  }

  @PostMapping
  UserEntity addUserEntity(@RequestBody UserEntity user) {
    return service.addUserEntity(user);
  }
  @DeleteMapping("{userId}")
  void deleteUserById(@PathVariable int userId){
    service.deleteUserById(userId);
  }

}
