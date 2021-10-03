package pl.lukaszSztajerowski.AddictionCravingDiary.User;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Size(min=2,max=30)
    private String login;

    @Email
    @Column(unique = true)
    private String email;

    private String password;


}
