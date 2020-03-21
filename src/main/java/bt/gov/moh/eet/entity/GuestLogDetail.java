package bt.gov.moh.eet.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by USER on 9/5/2019.
 */
@Entity
@Table(name = "guestlog")
public class GuestLogDetail {
    //region private variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "guest_id")
    private Integer guestId;

    @Column(name = "identification_type_id")
    private Integer identification_type_id;

    @Column(name = "identification_no")
    private String identification_no;

    @Column(name = "nationality_id")
    private Integer nationality_id;

    @Column(name = "guest_name")
    private String guest_name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "present_address")
    private String present_address;

    @Column(name = "contact_no")
    private Integer contact_no;

    @Column(name = "temperature")
    private Integer temperature;

    @Column(name = "entry_date_time")
    private Date entry_date_time;

    @Column(name = "exit_date_time")
    private Date exit_date_time;

    @Column(name = "reason_id")
    private Integer reason_id;

    @Column(name = "reason")
    private String reason;

    @Column(name = "gate_id")
    private Integer gateId;

    @Column(name = "created_by")
    private Integer created_by;

    @Column(name = "created_on")
    private Date created_on;

    @Column(name = "alert_flag")
    private Enum alertFlag;

    @Column(name = "alert_update_time")
    private Date alertUpdateTime;

    //endregion

    //region setters and getters


    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public Integer getIdentification_type_id() {
        return identification_type_id;
    }

    public void setIdentification_type_id(Integer identification_type_id) {
        this.identification_type_id = identification_type_id;
    }

    public String getIdentification_no() {
        return identification_no;
    }

    public void setIdentification_no(String identification_no) {
        this.identification_no = identification_no;
    }

    public Integer getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(Integer nationality_id) {
        this.nationality_id = nationality_id;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
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

    public String getPresent_address() {
        return present_address;
    }

    public void setPresent_address(String present_address) {
        this.present_address = present_address;
    }

    public Integer getContact_no() {
        return contact_no;
    }

    public void setContact_no(Integer contact_no) {
        this.contact_no = contact_no;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Date getEntry_date_time() {
        return entry_date_time;
    }

    public void setEntry_date_time(Date entry_date_time) {
        this.entry_date_time = entry_date_time;
    }

    public Date getExit_date_time() {
        return exit_date_time;
    }

    public void setExit_date_time(Date exit_date_time) {
        this.exit_date_time = exit_date_time;
    }

    public Integer getReason_id() {
        return reason_id;
    }

    public void setReason_id(Integer reason_id) {
        this.reason_id = reason_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Integer getGateId() {
        return gateId;
    }

    public void setGateId(Integer gateId) {
        this.gateId = gateId;
    }

    public Enum getAlertFlag() {
        return alertFlag;
    }

    public void setAlertFlag(Enum alertFlag) {
        this.alertFlag = alertFlag;
    }

    public Date getAlertUpdateTime() {
        return alertUpdateTime;
    }

    public void setAlertUpdateTime(Date alertUpdateTime) {
        this.alertUpdateTime = alertUpdateTime;
    }

    //endregion
}
