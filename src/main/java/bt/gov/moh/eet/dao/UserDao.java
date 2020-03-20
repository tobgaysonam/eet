package bt.gov.moh.eet.dao;

import bt.gov.moh.helper.DropdownDTO;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ICT-MoF on 3/20/2020.
 */
@Repository
public class UserDao extends BaseDao {
    @Transactional (readOnly = true)
    public List<DropdownDTO> getGate() {
        String sqlQuery = properties.getProperty("EntryExitTrackerDao.getGates");
        Query hQuery = (Query) hibernateQuery(sqlQuery, DropdownDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }
 public List<DropdownDTO> getUserType() {
        String sqlQuery = properties.getProperty("EntryExitTrackerDao.getUserType");
        Query hQuery = (Query) hibernateQuery(sqlQuery, DropdownDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }


}
