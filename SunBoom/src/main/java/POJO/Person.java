package POJO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mm on 2016/7/27.
 */
@Entity
public class Person {
    private int personID;
    private String userName;
    private String nickName;
    private String password;
    private int universityID;
    private String mail;
    private String avatar;
    private String introduction;
    private int sex;


    @Id
    @Column(name = "personID")
    public int getPersonID() {
        return personID;
    }
    public void setpersonID(int personID) {
        this.personID = personID;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "nickName")
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "universityID")
    public int getUniversityID() {
        return universityID;
    }
    public void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "sex")
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }

}
