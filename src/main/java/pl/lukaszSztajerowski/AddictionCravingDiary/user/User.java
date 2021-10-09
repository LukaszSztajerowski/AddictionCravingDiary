package pl.lukaszSztajerowski.AddictionCravingDiary.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lukaszSztajerowski.AddictionCravingDiary.role.Role;
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
        this.addictionCravingDiary = new AddictionCravingDiary();// czy stworzyć przez acdRepository.create(new AddictionCravingDiary());
        //jesli tak to czy stworzyć konstruktor User(ACDRepository acdRepository)?
        this.roles = new ArrayList<>();
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

    @ManyToMany
    @JoinColumn(name="id_user")
    private List<Role> roles = new ArrayList<>();//to zostawic beze jakiejkolwiek adnotacji a w rolach urzyć many to one

}
