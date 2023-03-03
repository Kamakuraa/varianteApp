package ro.rarom.varianteApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ro.rarom.varianteApp.entity.variante.NewsEntity;
import ro.rarom.varianteApp.repository.OptionsRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NewsService {
  private final OptionsRepository repository;

  public List<NewsEntity> getAll() {
    return repository.findAll();


  }

  public Optional<NewsEntity> getNewsById(int newsId) {
    return repository.findById(newsId);
  }

  public NewsEntity addNews(NewsEntity news) {
    return repository.save(news);
  }

  public NewsEntity deleteNewsById(int newsId) {

    Optional<NewsEntity> inventory = repository.findById(newsId);

    inventory.ifPresent(repository::delete);
    return inventory.orElse(null);
  }
}
