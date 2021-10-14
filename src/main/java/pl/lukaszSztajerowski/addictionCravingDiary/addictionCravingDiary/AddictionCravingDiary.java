package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.Data;
import pl.lukaszSztajerowski.addictionCravingDiary.day.Day;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class AddictionCravingDiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Day> dayList;


}
