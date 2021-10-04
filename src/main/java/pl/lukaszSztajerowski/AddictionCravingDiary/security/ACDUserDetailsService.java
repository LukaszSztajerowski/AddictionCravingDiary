//package pl.lukaszSztajerowski.AddictionCravingDiary.security;
//
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import pl.lukaszSztajerowski.AddictionCravingDiary.user.UserRepository;
//
//@Service
//@AllArgsConstructor
//public class ACDUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        return userRepository.findByLoginIgnoreCase(login)
//                .map(ACDUserDetails::new)
//                .orElseThrow(() -> new UsernameNotFoundException(login));
//
//    }
//}
