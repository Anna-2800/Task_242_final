//package testgroup.Task_231.service;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import testgroup.Task_231.dao.UserDAO;
//import testgroup.Task_231.model.User;
//
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private final UserDAO userDAO;
//
//    public UserDetailsServiceImpl(UserDAO userDAO){
//        this.userDAO = userDAO;
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        User user = userDAO.findByUsername(username);
//
////        if (user == null) {
////            throw new UsernameNotFoundException("User not found");
////        }
////        return user;
//        return userDAO.findByUsername(username);
//    }

