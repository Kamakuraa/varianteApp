package ro.rarom.varianteApp.entity.variante;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;

import java.time.LocalDate;

@Entity
@Table(name = "files")
@Getter
@Setter

public class NewsFile {
  @Id
  @GeneratedValue
  private int newsId;

  private LocalDate date;

  private String newsBody;

  private String newsTitle;

  NewsFile() {
  }

  public NewsFile(LocalDate date, String newsBody, String newsTitle) {
    this.date = date;
    this.newsBody = newsBody;
    this.newsTitle = newsTitle;
  }
}
