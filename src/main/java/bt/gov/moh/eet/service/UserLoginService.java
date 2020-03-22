package bt.gov.moh.eet.service;

import bt.gov.moh.eet.dao.UserLoginDao;
import bt.gov.moh.eet.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
