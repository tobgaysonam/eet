package bt.gov.moh.eet.dao;

import bt.gov.moh.eet.dto.GuestLogDTO;
import bt.gov.moh.eet.entity.GuestLogDetail;
import bt.gov.moh.helper.DropdownDTO;
import bt.gov.moh.helper.ResponseMessage;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ICT-MoF on 3/20/2020.
 */
@Repository
public class GuestLogDao extends BaseDao {
    //@Autowired
    private SessionFactory sessionFactory;
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

    @Transactional(readOnly = true)
    public GuestLogDTO fetchExistingGuestLogDetails(String cidNo) {
        String query = "SELECT\n" +
                "  identification_type_id AS IdentificationTypeId,\n" +
                "  nationality_id AS nationalityId,\n" +
                "  guest_name AS NAME,\n" +
                "  gender AS gender,\n" +
                "  age AS age,\n" +
                "  present_address AS presentAddress,\n" +
                "  contact_no AS contactNo,\n" +
                "  temperature AS temperature,\n" +
                "  reason_id AS exitReasonId,\n" +
                "  reason AS reasons\n" +
                "FROM guestlog\n" +
                "WHERE identification_no = :cidNo";
        org.hibernate.Query hQuery = sessionFactory.getCurrentSession().createSQLQuery(query)
                .setResultTransformer(Transformers.aliasToBean(GuestLogDTO.class))
                .setParameter("cidNo", cidNo);
        return (GuestLogDTO) hQuery.uniqueResult();
    }
}
