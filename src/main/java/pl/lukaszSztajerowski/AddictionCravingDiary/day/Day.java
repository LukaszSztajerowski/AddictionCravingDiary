package pl.lukaszSztajerowski.AddictionCravingDiary.day;

import lombok.Data;
import pl.lukaszSztajerowski.AddictionCravingDiary.symptom.Symptom;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "days")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Date date;
    @ManyToMany
    private List<Symptom> symptomList;
}
