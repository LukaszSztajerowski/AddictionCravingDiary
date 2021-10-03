package pl.lukaszSztajerowski.AddictionCravingDiary.Symptom;

import java.util.List;

public class SymptomService {

    private final SymptomRepository symptomRepository;


    public SymptomService(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    public void createSymptom(Symptom symptomToAdd) {
        symptomRepository.save(symptomToAdd);
    }

    public List<Symptom> getSymptoms() {
        List<Symptom> symptomList = symptomRepository.findAll();
        return symptomList;
    }

    public Symptom getSymptomById(Long id) {
        Symptom symptomById = symptomRepository.getById(id);
        return symptomById;
    }

    public void updateSymptom(Symptom symptomToUpdate) {
        symptomRepository.save(symptomToUpdate);
    }

    public void deleteSymptom(Long id) {
        Symptom symptomById = symptomRepository.getById(id);
        if (symptomById != null) {
            symptomRepository.deleteById(id);
        }
    }
}
