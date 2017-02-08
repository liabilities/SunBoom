package utilities.enums;

/**
 * Created by cuihua on 2017/1/11.
 */
public enum Sex {

    //男，女，未知
    MALE(0), FEMALE(1), NOT_KNOW(2);

    private int representNum;

    private Sex(int a){
        representNum = a;
    }

    /**
     *
     * @return 该枚举相对应的汉字
     *
     * enum TO int
     * 便于界面调用，写入数据库
     */
    public int getRepresentNum() {
        return representNum;
    }

    /**
     *
     * @return 该类型对应的枚举代码
     *
     * int TO enum
     * 便于从数据库读入
     */
    public static Sex getEnum(int a) {
        for (Sex thisEnum : Sex.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
