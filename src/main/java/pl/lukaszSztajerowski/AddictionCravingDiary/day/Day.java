package pl.lukaszSztajerowski.AddictionCravingDiary.day;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lukaszSztajerowski.AddictionCravingDiary.symptom.Symptom;

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
    @ManyToMany
    private List<Symptom> symptomList;

    public Day(LocalDate date, List<Symptom> symptomList) {
        this.date = LocalDate.now();
        this.symptomList = new ArrayList<>();
    }
}
