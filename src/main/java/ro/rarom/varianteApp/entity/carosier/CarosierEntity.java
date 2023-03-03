package ro.rarom.varianteApp.entity.carosier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "carosier")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class CarosierEntity {

  @Id
  @GeneratedValue
  private int idFabricant;

  private String denumierFabricant;
  private String adresaFabricant;
  private String tip;

  private String contact;
  private int telefon;
  private String cod;
  private String email;
  private String locatie;
  private String cui;
  private String judet;

  private byte[] scanAut;

  CarosierEntity(){
  }

  public CarosierEntity(String denumierFabricant, String tip, String contact) {
    this.denumierFabricant = denumierFabricant;
    this.tip = tip;
    this.contact = contact;
  }
}
