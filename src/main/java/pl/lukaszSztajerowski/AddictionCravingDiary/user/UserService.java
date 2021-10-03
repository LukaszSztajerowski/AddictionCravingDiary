package pl.lukaszSztajerowski.AddictionCravingDiary.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);
    }
}
