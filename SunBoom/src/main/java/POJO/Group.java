package pojo;


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

    public String getAvatar() {
        return avatarPath;
    }

    public void setAvatar(String avatar) {
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

    public String getAttestation() {
        return attestationPath;
    }

    public void setAttestation(String attestation) {
        this.attestationPath = attestation;
    }
}
