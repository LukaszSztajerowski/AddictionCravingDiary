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
import java.util.Set;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 30)
    private String username;

    @Email
    @Column(unique = true)
    private String email;

    private String password;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Symptom> symptoms;

    @OneToOne
    private AddictionCravingDiary addictionCravingDiary;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
