package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.Data;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
public class AddictionCravingDiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    @ElementCollection
    private Map<Symptom,Integer> symptomPowerMap = new HashMap<>();

}
