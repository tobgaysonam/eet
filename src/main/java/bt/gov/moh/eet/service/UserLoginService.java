package bt.gov.moh.eet.service;

import bt.gov.moh.eet.dao.UserLoginDao;
import bt.gov.moh.eet.dto.UserDTO;
import com.squareup.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.G2C_CommonBusinessAPI.DefaultApi;
import org.wso2.client.model.G2C_CommonBusinessAPI.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by N-Zepa on 25-Sep-19.
 */
@Service
public class UserLoginService {
    @Autowired
    private UserLoginDao userLoginDao;

    public UserDTO login(String username) {
        return userLoginDao.login(username);
    }
}
