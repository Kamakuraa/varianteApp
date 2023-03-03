package ro.rarom.varianteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.rarom.varianteApp.entity.variante.NewsEntity;

public interface OptionsRepository extends JpaRepository<NewsEntity, Integer> {
}
