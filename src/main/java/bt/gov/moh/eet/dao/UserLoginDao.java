package bt.gov.moh.eet.dao;

import bt.gov.moh.eet.dto.*;
import com.squareup.okhttp.OkHttpClient;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
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
@Repository
public class UserLoginDao {

    //@Autowired
    SessionFactory sessionFactoryG2C;
    private Query hQuery;

    @Transactional(readOnly = true)
    public UserDTO login(String username) {
        Session session = sessionFactoryG2C.getCurrentSession();
        String query = "SELECT cid AS username \n" +
                ",password AS password \n" +
                ",full_name AS fullName \n" +
                ",user_type_id AS userTypeId \n" +
                "FROM users  WHERE cid =:username";
        hQuery = session.createSQLQuery(query).setResultTransformer(Transformers.aliasToBean(UserDTO.class))
                .setParameter("username", username);
        return (UserDTO) (hQuery.list().isEmpty() ? null : hQuery.list().get(0));
    }

//    @Transactional(readOnly = true)
//    public UserDTO login(String username) {
//        String sql = properties.getProperty("UserDao.getUserDetail");
//        org.hibernate.Query hQuery = hibernateQuery(sql, UserDTO.class);
//        hQuery.setParameter("username", username);
//        return hQuery.list().isEmpty() ? null : (UserDTO) hQuery.list().get(0);
//    }
}
