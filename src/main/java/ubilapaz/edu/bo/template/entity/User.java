package ubilapaz.edu.bo.template.entity;

//@Entity
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    Integer id;
    String nombre;
    String username;
    String password;
}
