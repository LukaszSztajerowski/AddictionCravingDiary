package pl.lukaszSztajerowski.AddictionCravingDiary.role;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lukaszSztajerowski.AddictionCravingDiary.user.User;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    private User user;

    public Role(String name){
        this.name = name;
    }
}
