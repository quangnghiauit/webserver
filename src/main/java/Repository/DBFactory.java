package Repository;

import com.tnd.common.dbservice.DBService;

import java.sql.SQLException;

public class DBFactory {
    public static DBService dbService;

    public static void init(String url) throws SQLException {
        dbService = new DBService(url);
        dbService.init(url);
    }
}
