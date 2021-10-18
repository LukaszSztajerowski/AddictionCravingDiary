package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.Data;
import lombok.ToString;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@ToString
public class AddictionCravingDiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date = LocalDate.now();

    @ElementCollection
    private Map<Symptom, Integer> symptomPowerMap = new HashMap<>();

}
