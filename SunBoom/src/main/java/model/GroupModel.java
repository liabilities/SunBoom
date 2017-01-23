package model;

import pojo.Group;

/**
 * Created by cuihua on 2017/1/13.
 */
public class GroupModel {
    public String groupID;

    public String universityID;

    public String tag;

    public String name;

    public String signature;

    public String introduction;

    public String avatarPath;

    public String password;

    public int memberNum;

    public String userName;

    public String attestationPath;


    public GroupModel(String groupID, String universityID, String tag, String name, String signature,
                      String introduction, String avatarPath, String password, int memberNum, String userName,
                      String attestationPath) {
        this.groupID = groupID;
        this.universityID = universityID;
        this.tag = tag;
        this.name = name;
        this.signature = signature;
        this.introduction = introduction;
        this.avatarPath = avatarPath;
        this.password = password;
        this.memberNum = memberNum;
        this.userName = userName;
        this.attestationPath = attestationPath;
    }

    public GroupModel(Group group) {
        this.groupID = String.valueOf(group.getGroupID());
        this.universityID = String.valueOf(group.getUniversityID());
        this.tag = group.getTag();
        this.name = group.getName();
        this.signature = group.getSignature();
        this.introduction = group.getIntroduction();
        this.avatarPath = group.getAvatar();
        this.password = group.getPassword();
        this.memberNum = group.getMemberNum();
        this.userName = group.getUserName();
        this.attestationPath = group.getAttestationPath();
    }

}
