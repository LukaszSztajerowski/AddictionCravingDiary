package pl.lukaszSztajerowski.AddictionCravingDiary.addictionCravingDiary;

import lombok.Data;
import pl.lukaszSztajerowski.AddictionCravingDiary.day.Day;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
public class AddictionCravingDiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Day> dayList;


}
