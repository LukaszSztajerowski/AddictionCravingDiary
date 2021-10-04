//package pl.lukaszSztajerowski.AddictionCravingDiary.security;
//
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import pl.lukaszSztajerowski.AddictionCravingDiary.user.UserRepository;
//
//import java.net.Authenticator;
//
//@Configuration
//@EnableGlobalMethodSecurity(securedEnabled = true)
//@AllArgsConstructor
//public class ACDSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private final UserRepository userRepository;
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                authorizeRequests()
//                .mvcMatchers(HttpMethod.GET, "/","/register","/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage("/login")
//
//        ;
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth){
//        auth.authenticationProvider(authenticationProvider());
//    }
//
//    @Bean
//    protected AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        ACDUserDetailsService detailsService = new ACDUserDetailsService(userRepository);
//        provider.setUserDetailsService(detailsService);
//        provider.setPasswordEncoder(passwordEncoder());
//        return provider;
//
//    }
//
//    @Bean
//    protected PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
