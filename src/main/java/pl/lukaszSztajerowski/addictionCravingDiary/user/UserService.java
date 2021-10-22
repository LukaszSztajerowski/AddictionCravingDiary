package pl.lukaszSztajerowski.addictionCravingDiary.user;

public interface UserService {

    User findByUsername(String name);

    void createUser(User user);

}
