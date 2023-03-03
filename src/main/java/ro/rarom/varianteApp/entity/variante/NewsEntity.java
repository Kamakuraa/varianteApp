package ro.rarom.varianteApp.entity.variante;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "news")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class NewsEntity {
  @Id
  @GeneratedValue
  private int newsId;

  private LocalDate localDate;

  private String newsBody;

  private String newsTitle;

  @OneToMany(cascade = CascadeType.ALL)
  private List<NewsFile> newsFile;

  NewsEntity() {

  }

  public NewsEntity(LocalDate localDate, String newsBody, String newsTitle) {
    this.localDate = localDate;
    this.newsBody = newsBody;
    this.newsTitle = newsTitle;
  }
}
