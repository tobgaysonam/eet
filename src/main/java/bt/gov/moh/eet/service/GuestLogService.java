package bt.gov.moh.eet.service;

import bt.gov.moh.eet.dao.GuestLogDao;
import bt.gov.moh.helper.DropdownDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ICT-MoF on 3/20/2020.
 */
@Service
public class GuestLogService {
    @Autowired
    private GuestLogDao guestLogDao;

    public List<DropdownDTO> getIdentificationType() {
        return guestLogDao.getIdentificationType();
    }
    public List<DropdownDTO> getExitReasons() {
        return guestLogDao.getExitReasons();
    }
    public List<DropdownDTO> getNationalities() {
        return guestLogDao.getNationalities();
    }


}
