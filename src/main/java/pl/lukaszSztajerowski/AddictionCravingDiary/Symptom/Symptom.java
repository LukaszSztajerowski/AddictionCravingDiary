package pl.lukaszSztajerowski.AddictionCravingDiary.Symptom;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

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
    private String symptomName;

    private String syptomDescription;

    @Range(min = 0, max = 3)
    private Integer symptomsPower;


}
