package pl.lukaszSztajerowski.AddictionCravingDiary.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.lukaszSztajerowski.AddictionCravingDiary.role.Role;
import pl.lukaszSztajerowski.AddictionCravingDiary.role.RoleRepository;
import pl.lukaszSztajerowski.AddictionCravingDiary.symptom.Symptom;
import pl.lukaszSztajerowski.AddictionCravingDiary.user.User;
import pl.lukaszSztajerowski.AddictionCravingDiary.user.UserRepository;
import pl.lukaszSztajerowski.AddictionCravingDiary.user.UserService;

import java.util.Arrays;
import java.util.HashSet;

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
    public User findByUserName(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public void createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setSymptoms(new HashSet<Symptom>());
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}
