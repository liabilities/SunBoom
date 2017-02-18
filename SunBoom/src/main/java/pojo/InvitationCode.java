package pojo;

import java.util.Date;

/**
 * Created by cuihua on 2017/2/18.
 */
public class InvitationCode {

    /**
     *
     */
    private int rowID;

    /**
     * 邀请码
     */
    private String code;

    /**
     * 发出邀请码的团体ID
     */
    private int groupID;

    /**
     * 邀请码截止日期
     */
    private Date ddl;

    public InvitationCode(int rowID, String code, int groupID, Date ddl) {
        this.rowID = rowID;
        this.code = code;
        this.groupID = groupID;
        this.ddl = ddl;
    }

    public int getRowID() {
        return rowID;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public Date getDdl() {
        return ddl;
    }

    public void setDdl(Date ddl) {
        this.ddl = ddl;
    }
}
