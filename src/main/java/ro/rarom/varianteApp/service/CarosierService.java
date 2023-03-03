package ro.rarom.varianteApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.rarom.varianteApp.entity.carosier.CarosierEntity;
import ro.rarom.varianteApp.repository.CarosierRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarosierService {
  private final CarosierRepository repo;
  public List<CarosierEntity> getAll() {
    return repo.findAll();
  }

  public Optional<CarosierEntity> getCarosierById(int carosierId) {
    return repo.findById(carosierId);
  }

  public CarosierEntity addCarosier(CarosierEntity carosier) {
    return repo.save(carosier);
  }

  public CarosierEntity deleteCarosierById(int carosierId) {
    Optional<CarosierEntity> inventory = repo.findById(carosierId);
    inventory.ifPresent(repo::delete);

    return inventory.orElse(null);
  }
}
