package pojo;


import model.GroupModel;

/**
 * Created by I Like Milk on 2017/1/11.
 */

public class Group {
    private int groupID;

    private int universityID;

    private String tag;

    private String name;

    private String signature;

    private String introduction;

    private String avatarPath;

    private String password;

    private int memberNum;

    private String userName;

    private String attestationPath;

    public Group(){

    }


    public Group(GroupModel groupModel) {
        this.groupID = Integer.parseInt(groupModel.groupID);
        this.universityID = Integer.parseInt(groupModel.universityID);
        this.tag = groupModel.tag;
        this.name = groupModel.name;
        this.signature = groupModel.signature;
        this.introduction = groupModel.introduction;
        this.avatarPath = groupModel.avatarPath;
        this.password = groupModel.password;
        this.memberNum = groupModel.memberNum;
        this.userName = groupModel.userName;
        this.attestationPath = groupModel.attestationPath;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getUniversityID() {
        return universityID;
    }

    public void setUniversityID(int universityID) {
        universityID = universityID;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
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

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatar) {
        this.avatarPath = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAttestationPath() {
        return attestationPath;
    }

    public void setAttestationPath(String attestation) {
        this.attestationPath = attestation;
    }
}
