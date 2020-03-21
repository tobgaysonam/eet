package bt.gov.moh.eet.dao;

import bt.gov.moh.eet.entity.GuestLogDetail;
import bt.gov.moh.helper.DropdownDTO;
import org.hibernate.Query;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ICT-MoF on 3/20/2020.
 */
@Repository
public class GuestLogDao extends BaseDao {
    @Transactional (readOnly = true)
    public List<DropdownDTO> getIdentificationType() {
        String sqlQuery = properties.getProperty("EntryExitTrackerDao.getIdentificationType");
        Query hQuery = (Query) hibernateQuery(sqlQuery, DropdownDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }

    @Transactional (readOnly = true)
    public List<DropdownDTO> getExitReasons() {
        String sqlQuery = properties.getProperty("EntryExitTrackerDao.getExitReasons");
        Query hQuery = (Query) hibernateQuery(sqlQuery, DropdownDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }

    @Transactional (readOnly = true)
    public List<DropdownDTO> getNationalities() {
        String sqlQuery = properties.getProperty("EntryExitTrackerDao.getNationalities");
        Query hQuery = (Query) hibernateQuery(sqlQuery, DropdownDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }

    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveGuestLog(GuestLogDetail guestLogDetail) {
        try {
            getReportingSession().saveOrUpdate(guestLogDetail);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
