package ro.rarom.varianteApp.entity.vin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
//@Table(name = "VarianteVin")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class VarianteVin {
  @Id
  @GeneratedValue
  private int idVin;

  private int fabricantcuiFabricant;
  private String variantanumeVarianta;
  private int codVin;
  private LocalDate dataIntroducere;
  private boolean valabil;
  private LocalDate dataValidare;
  private String validatDe;
  private int idMotor;
  private String observatii;
  private String docVin;
  private String tipScaune;

  VarianteVin() {
  }

  public VarianteVin(int fabricantcuiFabricant, String variantanumeVarianta, int codVin) {
    this.fabricantcuiFabricant = fabricantcuiFabricant;
    this.variantanumeVarianta = variantanumeVarianta;
    this.codVin = codVin;
  }
}
