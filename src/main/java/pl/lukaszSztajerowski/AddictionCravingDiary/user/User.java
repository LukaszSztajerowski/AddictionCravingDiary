package pl.lukaszSztajerowski.AddictionCravingDiary.user;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
public class User {

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.symptoms = new ArrayList<>();
        this.addictionCravingDiary = new AddictionCravingDiary();
        this.roles = List.of("User");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=2,max=30)
    private String name;

    @Email
    @Column(unique = true)
    private String email;

    private String password;

    @ManyToMany
    private List<Symptom> symptoms = new ArrayList<>();

    @OneToOne
    private AddictionCravingDiary addictionCravingDiary;

    @ElementCollection
    private List<String> roles = new ArrayList<>();//błąd - jeszcze nie wiem jaki

}
