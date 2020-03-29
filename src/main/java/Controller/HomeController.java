package Controller;

import Model.Users;
import Service.HomeService;
import com.tnd.common.api.common.base.BaseRequest;
import com.tnd.common.api.common.base.BaseResponse;
import com.tnd.common.api.server.service.ServiceHandler;
import com.tnd.common.api.server.service.annotation.HandlerService;
import com.tnd.common.api.server.service.annotation.HandlerServiceClass;

import java.sql.SQLException;

@HandlerServiceClass
public class HomeController extends ServiceHandler {
    HomeService homeService = new HomeService();

    @HandlerService(path="/login", protocol = "POST", dataRequestType = "Model.Users")
    public BaseResponse<Boolean> login(BaseRequest<Users> request) throws SQLException {
        return new BaseResponse<>(homeService.login(request.getData().getUsername(),request.getData().getPassword()));
    }
}
