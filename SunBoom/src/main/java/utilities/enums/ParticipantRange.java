package utilities.enums;

/**
 * Created by cuihua on 2017/1/11.
 */
public enum ParticipantRange {

    //全部，只面向全城，只面向全校
    ALL(0), CITY(1), UNIVERSITY(2);

    private int representNum;

    private ParticipantRange(int a){
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
    public ParticipantRange getEnum(int a) {
        for (ParticipantRange thisEnum : ParticipantRange.values()){
            if (thisEnum.representNum == a){
                return thisEnum;
            }
        }
        return null;
    }
}
