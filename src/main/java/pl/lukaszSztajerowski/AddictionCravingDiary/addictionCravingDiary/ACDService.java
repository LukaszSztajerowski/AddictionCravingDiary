package pl.lukaszSztajerowski.AddictionCravingDiary.addictionCravingDiary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ACDService {

    private final ACDRepository acdRepository;

    public void createACD(AddictionCravingDiary addictionCravingDiary){
        acdRepository.save(addictionCravingDiary);
    }

    public Optional<AddictionCravingDiary> readACD(Long id){
        return acdRepository.findById(id);
    }

    public void updateACD(AddictionCravingDiary acdToUpdate){
        acdRepository.save(acdToUpdate);
    }

    public void deleteACD(Long id){
        Optional<AddictionCravingDiary> byId = acdRepository.findById(id);
        if(byId.isPresent()){
            acdRepository.deleteById(id);
        }
    }

    public List<AddictionCravingDiary> getACDs(){
        List<AddictionCravingDiary> acdList = acdRepository.findAll();
        return acdList;
    }
}
