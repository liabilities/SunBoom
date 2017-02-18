package model;

/**
 * 用于保存在session中的团体用户信息
 * Created by zs on 2017/2/18.
 */
public class GroupInf {
    private String groupID;
    private String schoolID;
    private String name;

    public GroupInf(String groupID, String schoolID, String name) {
        this.groupID = groupID;
        this.schoolID = schoolID;
        this.name = name;
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
}
