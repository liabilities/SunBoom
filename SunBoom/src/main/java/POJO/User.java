package POJO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mm on 2016/7/27.
 */
@Entity
public class User {
    private String id;
    private String password;
    private String email;
    private String sex;
    private String phone;
    private String address;
    private String userLogin;
    private String userState;
    private String checklistPath;
    private String personalPage;
    private String headPortrait;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 10)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "userLogin", nullable = false, length = 20)
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @Basic
    @Column(name = "userState", nullable = false, length = 20)
    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    @Basic
    @Column(name = "checklistPath", nullable = false, length = 255)
    public String getChecklistPath() {
        return checklistPath;
    }

    public void setChecklistPath(String checklistPath) {
        this.checklistPath = checklistPath;
    }

    @Basic
    @Column(name = "personalPage", nullable = true, length = 255)
    public String getPersonalPage() {
        return personalPage;
    }

    public void setPersonalPage(String personalPage) {
        this.personalPage = personalPage;
    }

    @Basic
    @Column(name = "headPortrait", nullable = true, length = 255)
    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (userLogin != null ? !userLogin.equals(user.userLogin) : user.userLogin != null) return false;
        if (userState != null ? !userState.equals(user.userState) : user.userState != null) return false;
        if (checklistPath != null ? !checklistPath.equals(user.checklistPath) : user.checklistPath != null)
            return false;
        if (personalPage != null ? !personalPage.equals(user.personalPage) : user.personalPage != null) return false;
        if (headPortrait != null ? !headPortrait.equals(user.headPortrait) : user.headPortrait != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userState != null ? userState.hashCode() : 0);
        result = 31 * result + (checklistPath != null ? checklistPath.hashCode() : 0);
        result = 31 * result + (personalPage != null ? personalPage.hashCode() : 0);
        result = 31 * result + (headPortrait != null ? headPortrait.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userState='" + userState + '\'' +
                ", checklistPath='" + checklistPath + '\'' +
                ", personalPage='" + personalPage + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                '}';
    }
}
