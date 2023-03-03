package ro.rarom.varianteApp.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserEntity {
  @Id
  @GeneratedValue
  private int userid;

  private String username;

  private String userparola;
  private String userdispalyname;
  private String usercontact;
  private String useremail;
  private int usertelefon;

  private UserType usertype;


  private int idrol;
  private int fabricantcui;
  private int useractiv;
  private String uuid;
  private String judet;

  UserEntity() {
  }

  public UserEntity(String username, String userparola) {
    this.username = username;
    this.userparola = userparola;

  }
}
