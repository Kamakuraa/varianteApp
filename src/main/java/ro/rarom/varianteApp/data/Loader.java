package ro.rarom.varianteApp.data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ro.rarom.varianteApp.entity.carosier.CarosierEntity;
import ro.rarom.varianteApp.entity.user.UserEntity;

import ro.rarom.varianteApp.repository.CarosierRepository;
import ro.rarom.varianteApp.repository.OptionsRepository;
import ro.rarom.varianteApp.repository.UserRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Loader implements CommandLineRunner {
  private final OptionsRepository optionsRepository;
  private final UserRepository userRepository;
  private final CarosierRepository carosierRepository;

  @Override
  public void run(String... args) throws Exception {
//    Fairy fairy = Fairy.create();
//
//    repo.saveAll(IntStream.range(0, 100)
//      .mapToObj(index -> fairy.company())
//      .map(news -> new NewsEntity(news.getDomain(), news.getEmail()))
//      .toList());
//    repo.saveAll(List.of(
//      new NewsEntity(LocalDate.now(), "Ceva", "Altceva"),
//      new NewsEntity(LocalDate.now(), "Ceva", "Altceva"),
//      new NewsEntity(LocalDate.now(), "Ceva", "Altceva"),
//      new NewsEntity(LocalDate.now(), "Ceva", "Altceva")
//    ));
    carosierRepository.saveAll(List.of(
      CarosierEntity.builder()
        .denumierFabricant("VOLVO")
        .tip("SRL")
        .contact("00000")
        .build()
    ));
//    userRepository.saveAll(List.of(
//      UserEntity.builder()
//        .username("alex_rar")
//        .userparola("Alex")
//        .build()
//    ));
//    userRepository.saveAll(List.of(
//      UserEntity.builder()
//        .username("bogdan_porsche")
//        .userparola("Alex")
//        .build()
//    ));

//    repo.saveAll(List.of(
//      NewsEntity.builder()
//        .newsTitle("ceva")
////        .newsFile((List<NewsFile>) new NewsFile(LocalDate.now(), "some", "newsTitle"))
//        .build(),
//      NewsEntity.builder()
//        .newsTitle("altceva")
////        .newsFile(( new NewsFile(LocalDate.now(), "some", "newsTitle"))
//        .build()
//    ));
  }
}
