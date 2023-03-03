package ro.rarom.varianteApp.entity.atribute;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "atributeVariante")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class AtributeEntity {
  @Id
  @GeneratedValue
  private int idAtribute;

  private String label;
  private String value;
  private String tip;
  private String valoareaSelectie;
  private String grupa;
  private int dependentNrAxe;
  private String validare;
  private String numeVarianta;
  private int isok;
  private String errormessage;
  private int orderindex;
  private int cloneEditable;
  private int guideId;
  private int idNomenclator;
  private int axa;
  private int max;
  private int min;
  private int destres;

  AtributeEntity() {
  }

  public AtributeEntity(String label, String value, String tip, String valoareaSelectie) {
    this.label = label;
    this.value = value;
    this.tip = tip;
    this.valoareaSelectie = valoareaSelectie;
  }
}
