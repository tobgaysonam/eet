package bt.gov.moh.eet.dto;

import org.exolab.castor.types.DateTime;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by nzepa on 3/7/2020.
 */
public class GuestLogDTO {

    //private variables region
    private Integer IdentificationTypeId;
    private String identificationNo;
    private Integer nationalityId;
    private String name;
    private String gender;
    private Integer age;
    private String presentAddress;
    private Integer contactNo;
    private Integer temperature;
    private DateTime entryDate;
    private DateTime exitDate;
    private Integer exitReasonId;
    private String reasons;
    private Integer created_by;
    private DateTime created_on;

    //setter and getter region

    public Integer getIdentificationTypeId() {
        return IdentificationTypeId;
    }

    public void setIdentificationTypeId(Integer identificationTypeId) {
        IdentificationTypeId = identificationTypeId;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public Integer getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public Integer getContactNo() {
        return contactNo;
    }

    public void setContactNo(Integer contactNo) {
        this.contactNo = contactNo;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public DateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(DateTime entryDate) {
        this.entryDate = entryDate;
    }

    public DateTime getExitDate() {
        return exitDate;
    }

    public void setExitDate(DateTime exitDate) {
        this.exitDate = exitDate;
    }

    public Integer getExitReasonId() {
        return exitReasonId;
    }

    public void setExitReasonId(Integer exitReasonId) {
        this.exitReasonId = exitReasonId;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public DateTime getCreated_on() {
        return created_on;
    }

    public void setCreated_on(DateTime created_on) {
        this.created_on = created_on;
    }
}
