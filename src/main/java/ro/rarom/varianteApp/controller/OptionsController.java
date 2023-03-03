package ro.rarom.varianteApp.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ro.rarom.varianteApp.entity.variante.NewsEntity;
import ro.rarom.varianteApp.exception.ResourceNotFoundException;
import ro.rarom.varianteApp.service.NewsService;

import java.util.List;

@RestController
@RequestMapping("options")
@RequiredArgsConstructor
public class OptionsController {
  private final NewsService service;

  @GetMapping
  List<NewsEntity> getAll() {
    return service.getAll();
  }

  @GetMapping("{newsId}")
  NewsEntity getNewsById(@PathVariable int newsId) {
    return service.getNewsById(newsId)
      .orElseThrow(() -> new ResourceNotFoundException("Could not find product with id " + newsId));
  }

  @PostMapping
  NewsEntity addNews(@RequestBody NewsEntity news){
    return service.addNews(news);
  }

  @DeleteMapping("{newsId}")
  void deleteNewsById(@PathVariable int newsId){
    service.deleteNewsById(newsId);
  }
}
