package utilities.enums;

/**
 * Created by zoetx on 2017/1/13.
 */
public enum ActivityType {

    VOLUNTEER(0),
    MUSIC(1),
    SPORT(2);

    private int representNum;
    private ActivityType(int representNum){
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
    public static ActivityType getEnum(int a) {
        for (ActivityType thisEnum : ActivityType.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
