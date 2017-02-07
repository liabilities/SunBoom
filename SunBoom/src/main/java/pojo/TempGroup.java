package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/12.
 */
public class TempGroup {
   private int groupID;
   private String name;
   private String tag;
   private int scale;
   private int presentMemberNum;
   private String signature;
   private String memberRequestion;
   private String goal;
   private String avatar;
   private Date registerTime;
   private int verify;
   private int fellowGroup;
   private int fellowPerson;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getPresentMemberNum() {
        return presentMemberNum;
    }

    public void setPresentMemberNum(int presentMemberNum) {
        this.presentMemberNum = presentMemberNum;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getMemberRequestion() {
        return memberRequestion;
    }

    public void setMemberRequestion(String memberRequestion) {
        this.memberRequestion = memberRequestion;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getVerify() {
        return verify;
    }

    public void setVerify(int verify) {
        this.verify = verify;
    }

    public int getFellowGroup() {
        return fellowGroup;
    }

    public void setFellowGroup(int fellowGroup) {
        this.fellowGroup = fellowGroup;
    }

    public int getFellowPerson() {
        return fellowPerson;
    }

    public void setFellowPerson(int fellowPerson) {
        this.fellowPerson = fellowPerson;
    }


}
