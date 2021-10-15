package pl.lukaszSztajerowski.addictionCravingDiary.symptom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface SymptomRepository extends JpaRepository<Symptom,Long> {


}
