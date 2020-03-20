package bt.gov.moh.eet.service;

import bt.gov.moh.eet.dao.GuestLogDao;
import bt.gov.moh.eet.dao.UserDao;
import bt.gov.moh.helper.DropdownDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ICT-MoF on 3/20/2020.
 */
@Service
public class UserRegoService {
    @Autowired
    private UserDao userDao;

    public List<DropdownDTO> getGate()
    {
        return userDao.getGate();
    }
    public List<DropdownDTO> getUserType()
    {
        return userDao.getUserType();
    }


}
