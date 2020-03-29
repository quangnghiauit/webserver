package Service;

import Exceptions.UserNotFoundException;
import Model.Users;
import Repository.DBFactory;
import Repository.UserRepository;

import java.sql.SQLException;

public class HomeService {
    UserRepository userRepository = new UserRepository();
    public Boolean login(String username, String password) throws SQLException {
        try {
            Users user = userRepository.get(username);
            if(user.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } catch (UserNotFoundException e) {
            return false;
        }
    }
}
