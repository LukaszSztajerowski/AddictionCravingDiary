
package pl.lukaszSztajerowski.addictionCravingDiary.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.lukaszSztajerowski.addictionCravingDiary.role.Role;
import pl.lukaszSztajerowski.addictionCravingDiary.role.RoleRepository;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findByUsername(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setSymptoms(new ArrayList<Symptom>());
        if(?????????????????????????) {
            user.setRoles(new HashSet<Role>(Arrays.asList(new Role("ROLE_USER"))));
        }else{
            user.setRoles(new HashSet<Role>(Arrays.asList(roleRepository.findByName("ROLE_USER"))));
        }
        userRepository.save(user);
    }

    public Optional<User> readUser(Long id){
       return userRepository.findById(id);
    }

    public void updateUser(User userToUpdate){
        userRepository.save(userToUpdate);
    }

    public void deleteUser(Long id){
        Optional<User> byId = userRepository.findById(id);
        if(byId.isPresent()){
            userRepository.deleteById(id);
        }
    }

    public List<User> getUsers(){
        List<User> userList = userRepository.findAll();
        return  userList;
    }

}