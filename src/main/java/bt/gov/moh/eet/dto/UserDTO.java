package bt.gov.moh.eet.dto;

import org.exolab.castor.types.DateTime;

/**
 * Created by nzepa on 3/7/2020.
 */
public class UserDTO {

    //private variables region
    private Integer cid;
    private String password;
    private String full_name;
    private Integer mobile_number;
    private String designation;
    private String working_address;
    private Integer user_type_id;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(Integer mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getWorking_address() {
        return working_address;
    }

    public void setWorking_address(String working_address) {
        this.working_address = working_address;
    }

    public Integer getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
    }
}
