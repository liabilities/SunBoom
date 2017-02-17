package utilities.enums;

/**
 * Created by cuihua on 2017/1/11.
 */
public enum NetworkingState {

    //未发布／草稿，已发布，已结束，已取消
    UNANNOUNCED(0), ANNOUNCED(1), FINISHED(2), CANCELLED(3);

    private int representNum;

    private NetworkingState(int a){
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
    public static NetworkingState getEnum(int a) {
        for (NetworkingState thisEnum : NetworkingState.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
