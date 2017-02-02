package pojo;

/**
 * Created by zoetx on 2017/2/2.
 */
public class Fellow {

    private int fellowID;
    private int followedID;
    private int type;

    public int getFellowID() {
        return fellowID;
    }

    public void setFellowID(int fellowID) {
        this.fellowID = fellowID;
    }

    public int getFollowedID() {
        return followedID;
    }

    public void setFollowedID(int followedID) {
        this.followedID = followedID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
