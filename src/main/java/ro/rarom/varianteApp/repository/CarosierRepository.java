package ro.rarom.varianteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.rarom.varianteApp.entity.carosier.CarosierEntity;

public interface CarosierRepository extends JpaRepository<CarosierEntity, Integer> {
}
