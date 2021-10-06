package pl.lukaszSztajerowski.AddictionCravingDiary.symptom;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lukaszSztajerowski.AddictionCravingDiary.user.User;

public interface SymptomRepository extends JpaRepository<Symptom,Long> {



}
