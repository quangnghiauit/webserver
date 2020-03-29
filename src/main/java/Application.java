import Controller.HomeController;
import Repository.DBFactory;
import com.tnd.common.api.server.CommonServer;
import com.tnd.common.dbservice.DBService;

public class Application {
    public static void main(String args[]) throws Exception {
        DBFactory.init("jdbc:mysql://localhost:3306/GARA?user=root&password=123456");
        CommonServer commonServer = new CommonServer();
        commonServer.register(new HomeController());
        commonServer.initServlet(8080);
        commonServer.startServer();
    }
}
