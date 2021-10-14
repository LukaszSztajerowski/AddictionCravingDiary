package pl.lukaszSztajerowski.addictionCravingDiary.day;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "days")
@NoArgsConstructor
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private LocalDate date;

    @OneToMany
    private List<Symptom> symptomList;

    public Day(LocalDate date, List<Symptom> symptomList) {
        this.date = LocalDate.now();
        this.symptomList = symptomList;
    }
}
