package utilities.enums;

/**
 * Created by cuihua on 2017/2/17.
 * TODO 小他：不知道活动发起者类型有哪些，我就算随便写了个
 */
public enum ActivityInitiatorType {
    STUDENT(0);


    private int representNum;

    ActivityInitiatorType(int representNum) {
        this.representNum = representNum;
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
    public static ActivityInitiatorType getEnum(int a) {
        for (ActivityInitiatorType thisEnum : ActivityInitiatorType.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
