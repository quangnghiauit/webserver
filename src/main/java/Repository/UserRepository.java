package Repository;

import Exceptions.UserNotFoundException;
import Model.Users;
import com.tnd.common.dbservice.DBService;

import java.sql.SQLException;
import java.util.List;

public class UserRepository {
    private static final String GET_USER_BY_USERNAME = "Select * from users where username = '%s'";
    public Users get(String username) throws SQLException, UserNotFoundException {
        String query = String.format(GET_USER_BY_USERNAME,username);
        List<Users> users = DBFactory.dbService.executeQuery(query, Users.class);
        if(users == null || users.size() == 0) {
            throw new UserNotFoundException();
        }
        return users.get(0);
    }
}
