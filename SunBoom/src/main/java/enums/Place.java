package enums;

/**
 * Created by cuihua on 2017/1/11.
 */
public enum Place {

    //室内，室外
    INTERIOR(0), EXTERIOR(1);

    private int representNum;

    private Place(int a){
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
    public Place getEnum(int a) {
        for (Place thisEnum : Place.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
