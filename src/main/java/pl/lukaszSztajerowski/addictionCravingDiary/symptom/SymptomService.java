package pl.lukaszSztajerowski.addictionCravingDiary.symptom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SymptomService {

    private final SymptomRepository symptomRepository;

    public void createSymptom(Symptom symptomToAdd) {
        symptomRepository.save(symptomToAdd);
    }

    public Optional<Symptom> getSymptomById(Long id) {
        Optional<Symptom> byId = symptomRepository.findById(id);
        return byId;
    }

    public void updateSymptom(Symptom symptomToUpdate) {
        symptomRepository.save(symptomToUpdate);
    }

    public void deleteSymptom(Long id) {
        Optional<Symptom> byId = symptomRepository.findById(id);
        if (byId.isPresent()) {
            symptomRepository.deleteById(id);
        }
    }

    public List<Symptom> getSymptoms() {
        List<Symptom> symptomList = symptomRepository.findAll();
        return symptomList;
    }

}
