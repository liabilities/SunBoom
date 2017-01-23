package pojo;


import model.GroupModel;

import java.util.Date;

/**
 * Created by I Like Milk on 2017/1/11.
 */

public class Group {

    private int groupID;
    private int schoolID;
    private String tag;
    private String name;
    private String signature;
    private String introduction;
    private String avatar;
    private String password;
    private int memberNum;
    private String userName;
    private String tel;
    private String mail;
    private String detailPath;
    private Date registerTime;
    private Date identificationTime;
    private Date deadline;
    private int fellowNum_group;
    private int fellowNum_person;
    private String certifiedMaterial;

    public Group(GroupModel group) {
        this.groupID = group.getGroupID_int();
        this.schoolID = group.getSchoolID_int();
        this.tag = group.getTag();
        this.name = group.getName();
        this.signature = group.getSignature();
        this.introduction = group.getIntroduction();
        this.avatar = group.getAvatar();
        this.password = group.getPassword();
        this.memberNum = group.getMemberNum();
        this.userName = group.getUserName();
        this.tel = group.getTel();
        this.mail = group.getMail();
        this.detailPath = group.getDetailPath();
        this.registerTime = group.getRegisterTime_date();
        this.identificationTime = group.getIdentificationTime_date();
        this.deadline = group.getDeadline_date();
        this.fellowNum_group = group.getFellowNum_group();
        this.fellowNum_person = group.getFellowNum_person();
        this.certifiedMaterial = group.getCertifiedMaterial();
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getFellowNum_group() {
        return fellowNum_group;
    }

    public void setFellowNum_group(int fellowNum_group) {
        this.fellowNum_group = fellowNum_group;
    }

    public int getFellowNum_person() {
        return fellowNum_person;
    }

    public void setFellowNum_person(int fellowNum_person) {
        this.fellowNum_person = fellowNum_person;
    }

    public String getCertifiedMaterial() {
        return certifiedMaterial;
    }

    public void setCertifiedMaterial(String certifiedMaterial) {
        this.certifiedMaterial = certifiedMaterial;
    }

}
