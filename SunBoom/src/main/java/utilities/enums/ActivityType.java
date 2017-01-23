package utilities.enums;

/**
 * Created by zoetx on 2017/1/13.
 */
public enum ActivityType {

    VOLUNTEER(0),
    MUSIC(1),
    SPORT(2);

    private int index;
    private ActivityType(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
