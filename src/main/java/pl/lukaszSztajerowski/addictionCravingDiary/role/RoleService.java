package pl.lukaszSztajerowski.addictionCravingDiary.role;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public void createRole(Role role) {
        roleRepository.save(role);
    }


}
