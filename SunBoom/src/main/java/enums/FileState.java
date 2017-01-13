package enums;

/**
 * Created by lenovo on 2017/1/13.
 */
public enum FileState {

    PRIVATE(0),
    PROTECTED(1),
    PUBLIC(2),
    ISDELETED(3);

    private int index;

    private FileState(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
