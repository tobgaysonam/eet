package bt.gov.moh.eet.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String username;
    private String fullName;
    private String password;
    private Integer userTypeId;
    private Boolean changePasswordYN;

    private Integer roleId;

    public UserDTO() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getChangePasswordYN() {
        return changePasswordYN;
    }

    public void setChangePasswordYN(Boolean changePasswordYN) {
        this.changePasswordYN = changePasswordYN;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserDTO) {
            UserDTO userLogin = (UserDTO) obj;
            return userLogin.getUsername().equals(this.username);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.username.hashCode();
        return hash;
    }
}