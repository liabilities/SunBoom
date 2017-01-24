package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/24.
 */

public class Person {
    private int personID;
    private String usesrname;
    private String password;
    private String nickName;
    private int schoolID;
    private String mail;
    private String avatar;
    private String introduction;
    private int sex;
    private String detailPath ;
    private Date registerTime ;
    private Date identificationTime ;
    private int state;

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getUsesrname() {
        return usesrname;
    }

    public void setUsesrname(String usesrname) {
        this.usesrname = usesrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDetailPath() {
        return detailPath;
    }

    public void setDetailPath(String detailPath) {
        this.detailPath = detailPath;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getIdentificationTime() {
        return identificationTime;
    }

    public void setIdentificationTime(Date identificationTime) {
        this.identificationTime = identificationTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
