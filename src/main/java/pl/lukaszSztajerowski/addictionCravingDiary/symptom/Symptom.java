package pl.lukaszSztajerowski.addictionCravingDiary.symptom;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "symptoms")
@Data
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 2, max = 50)
    private String name;

}
