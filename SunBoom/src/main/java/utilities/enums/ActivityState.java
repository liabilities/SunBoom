package utilities.enums;

/**
 * Created by cuihua on 2017/2/8.
 */
public enum ActivityState {

    //尚未开始，正在进行，已结束
    PREPARING(0), UNDERGOING(1), COMPLETED(2);

    private int representNum;

    private ActivityState(int a) {
        this.representNum = a;
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
    public static ActivityState getEnum(int a) {
        for (ActivityState thisEnum : ActivityState.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
