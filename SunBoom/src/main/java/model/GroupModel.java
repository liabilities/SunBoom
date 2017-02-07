package model;

import pojo.Group;
import utilities.tool.DateHelper;

import java.util.Date;

/**
 * Created by cuihua on 2017/1/13.
 */
public class GroupModel implements Comparable{
    private String groupID;
    private String schoolID;
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
    private String registerTime;
    private String identificationTime;
    private String deadline;
    private int fellowNum_group;
    private int fellowNum_person;
    private String certifiedMaterial;
    private String capital;

    public String getGroupID() {
        return groupID;
    }

    public int getGroupID_int() {
        return Integer.parseInt(groupID);
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public int getSchoolID_int() {
        return Integer.parseInt(schoolID);
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
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

    public String getRegisterTime() {
        return registerTime;
    }

    public Date getRegisterTime_date() {
        return DateHelper.String2Date(registerTime);
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getIdentificationTime() {
        return identificationTime;
    }

    public Date getIdentificationTime_date() {
        return DateHelper.String2Date(identificationTime);
    }

    public void setIdentificationTime(String identificationTime) {
        this.identificationTime = identificationTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public Date getDeadline_date() {
        return DateHelper.String2Date(deadline);
    }

    public void setDeadline(String deadline) {
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public GroupModel(String groupID , String schoolID , String tag , String name , String signature , String introduction ,
                      String avatar , String password , int memberNum , String userName , String tel , String mail ,
                      String detailPath , String registerTime , String identificationTime , String deadline ,
                      int fellowNum_group , int fellowNum_person , String certifiedMaterial ) {
        this.groupID = groupID;
        this.schoolID = schoolID;
        this.tag = tag;
        this.name = name;
        this.signature = signature;
        this.introduction = introduction;
        this.avatar = avatar;
        this.password = password;
        this.memberNum = memberNum;
        this.userName = userName;
        this.tel = tel;
        this.mail = mail;
        this.detailPath = detailPath;
        this.registerTime = registerTime;
        this.identificationTime = identificationTime;
        this.deadline = deadline;
        this.fellowNum_group = fellowNum_group;
        this.fellowNum_person = fellowNum_person;
        this.certifiedMaterial = certifiedMaterial;

    }

    public GroupModel(String name, String ID, String avatar, String capital) {
        this.name = name;
        this.groupID = ID;
        this.avatar = avatar;
        this.capital = capital;
    }

    public GroupModel(Group group) {
        this.groupID = String.valueOf(group.getGroupID());
        this.schoolID = String.valueOf(group.getSchoolID());
        this.tag = group.getTag();
        this.name = group.getName();
        this.signature = group.getSignature();
        this.introduction = group.getIntroduction();
        this.avatar = group.getAvatar();
        this.password = group.getPassword();
        this.memberNum = group.getMembernum();
        this.userName = group.getUsername();
        this.tel = group.getTel();
        this.mail = group.getMail();
        this.detailPath = group.getDetailPath();
        this.registerTime = DateHelper.Date2String(group.getRegisterTime());
        this.identificationTime = DateHelper.Date2String(group.getIdentificationTime());
        this.deadline = DateHelper.Date2String(group.getDeadline());
        this.fellowNum_group = group.getFellowGroup();
        this.fellowNum_person = group.getFellowPerson();
        this.certifiedMaterial = group.getCertifiedMaterial();
    }

    public int compareTo(Object o) {
        GroupModel groupModel = (GroupModel)o;
        return this.getName().compareTo(groupModel.getName());
    }
}
