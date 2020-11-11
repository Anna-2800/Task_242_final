package testgroup.Task_231.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import testgroup.Task_231.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(long id);

}
