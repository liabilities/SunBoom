package model;

/**
 * Created by lvdechao on 2016/7/22.
 */
public class UserAndDefect {
    private String userId;
    private int defectNum;

    public UserAndDefect() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getDefectNum() {
        return defectNum;
    }

    public void setDefectNum(int defectNum) {
        this.defectNum = defectNum;
    }
}
