package pl.lukaszSztajerowski.AddictionCravingDiary.day;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DayService {

    private final DayRepository dayRepository;

    public void createDay(Day day){
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
