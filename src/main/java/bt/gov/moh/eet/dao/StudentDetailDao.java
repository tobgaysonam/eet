package bt.gov.moh.eet.dao;

import bt.gov.moh.eet.dto.StudentDetailDTO;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nzepa on 3/7/2020.
 */
@Repository
public class StudentDetailDao extends BaseDao{

    @Transactional(readOnly = true)
    public StudentDetailDTO getStudentDetail(String cid) {
        String query = properties.getProperty("ChargeAllocationDao.getStudentDetail");
        org.hibernate.Query hQuery = hibernateQuery(query, StudentDetailDTO.class);
        hQuery.setParameter("cid", cid);
        return (StudentDetailDTO) hQuery.uniqueResult();
    }

    @Transactional(readOnly = true)
    public List<StudentDetailDTO> getStudentList() {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getStudentList");
        Query hQuery = hibernateQuery(sqlQuery, StudentDetailDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }

    @Transactional(readOnly = true)
    public List<StudentDetailDTO> getTopThreeStudentList() {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getTopThreeStudentList");
        Query hQuery = hibernateQuery(sqlQuery, StudentDetailDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }

    @Transactional(readOnly = true)
    public StudentDetailDTO getAvgMarksRatioList() {
        String query = properties.getProperty("ChargeAllocationDao.getAvgMarksRatioList");
        org.hibernate.Query hQuery = hibernateQuery(query, StudentDetailDTO.class);
        return (StudentDetailDTO) hQuery.uniqueResult();
    }
}
