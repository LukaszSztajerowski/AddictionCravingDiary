package pl.lukaszSztajerowski.AddictionCravingDiary.user;

import lombok.Data;
import pl.lukaszSztajerowski.AddictionCravingDiary.addictionCravingDiary.AddictionCravingDiary;
import pl.lukaszSztajerowski.AddictionCravingDiary.symptom.Symptom;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Size(min=2,max=30)
    private String login;

    @Email
    @Column(unique = true)
    private String email;

    private String password;

    @ManyToMany
    private List<Symptom> symptoms = new ArrayList<>();

    @OneToOne
    private AddictionCravingDiary addictionCravingDiary;

}
