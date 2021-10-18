package pl.lukaszSztajerowski.addictionCravingDiary.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary.AddictionCravingDiary;
import pl.lukaszSztajerowski.addictionCravingDiary.role.Role;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
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
    private String name;

    @Email
    @Column(unique = true)
    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Symptom> symptomList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<AddictionCravingDiary> addictionCravingDiary = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}
