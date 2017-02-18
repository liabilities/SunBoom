package model;

/**
 * 用于保存在session中的团体用户信息
 * Created by zs on 2017/2/18.
 */
public class GroupInf {
    private String groupID;
    private String schoolID;
    //官方名称
    private String name;
    //账号名称
    private String userName;

    public GroupInf(String groupID, String schoolID, String name, String userName) {
        this.groupID = groupID;
        this.schoolID = schoolID;
        this.name = name;
        this.userName = userName;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "GroupInf{" +
                "groupID='" + groupID + '\'' +
                ", schoolID='" + schoolID + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
