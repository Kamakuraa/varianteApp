package ro.rarom.varianteApp.entity.anexe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "anexeRaport")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class AnexeRaport {
  @Id
  @GeneratedValue
  private int id;

  private String nrCertificat;

  private int idRaport;
  private int nrAnexa;
  private int idVin;
  private int tip;

  AnexeRaport() {
  }

  public AnexeRaport(String nrCertificat, int idRaport, int nrAnexa) {
    this.nrCertificat = nrCertificat;
    this.idRaport = idRaport;
    this.nrAnexa = nrAnexa;
  }
}
