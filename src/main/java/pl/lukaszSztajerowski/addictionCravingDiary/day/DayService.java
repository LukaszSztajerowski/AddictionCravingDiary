package pl.lukaszSztajerowski.addictionCravingDiary.day;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary.ACDRepository;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DayService {

    private final UserRepository userRepository;
    private final DayRepository dayRepository;
    private final ACDRepository acdRepository;

    public void createDay(Day day){
        day.setDate(LocalDate.now());

        dayRepository.save(day);
    }

    public Optional<Day> readDay(Long id){
        return dayRepository.findById(id);
    }

    public void updateDay(Day dayToUpdate){
        dayRepository.save(dayToUpdate);
    }

    public void deleteDay(Long id){
        Optional<Day> dayById = dayRepository.findById(id);
        if(dayById.isPresent()){
           dayRepository.deleteById(id);
        }
    }

    public List<Day> getDays(){
        List<Day> dayList = dayRepository.findAll();
        return dayList;
    }

}
