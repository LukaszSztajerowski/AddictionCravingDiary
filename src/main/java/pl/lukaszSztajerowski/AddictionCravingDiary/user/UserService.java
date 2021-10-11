package pl.lukaszSztajerowski.AddictionCravingDiary.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User findByUserName(String name);

    void createUser(User user);
//    private final UserRepository userRepository;
//
//    public void createUser(User user){
//        userRepository.save(user);
//    }
//
//    public Optional<User> readUser(Long id){
//       return userRepository.findById(id);
//    }
//
//    public void updateUser(User userToUpdate){
//        userRepository.save(userToUpdate);
//    }
//
//    public void deleteUser(Long id){
//        Optional<User> byId = userRepository.findById(id);
//        if(byId.isPresent()){
//            userRepository.deleteById(id);
//        }
//    }
//
//    public List<User> getUsers(){
//        List<User> userList = userRepository.findAll();
//        return  userList;
//    }
}
