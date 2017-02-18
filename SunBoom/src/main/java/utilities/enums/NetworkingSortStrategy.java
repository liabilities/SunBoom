package utilities.enums;

/**
 * Created by cuihua on 2017/2/18.
 */
public enum NetworkingSortStrategy {

    // 开始时间升序， 开始时间倒序，结束时间升序，结束时间倒序，
    // 响应截止时间升序，响应截止时间倒序，
    // 最小规模升序，最小规模降序，最大规模升序，最大规模降序，
    // 发起团队联谊人数升序，发起团队联谊人数降序
    ASC_START_TIME, DEC_START_TIME, ASC_END_TIME, DEC_END_TIME,
    ASC_RESPONDING_DDL, DEC_RESPONDING_DDL,
    ASC_MIN_SCALE, DEC_MIN_SCALE, ASC_MAX_SCALE, DEC_MAX_SCALE,
    ASC_HOST_NUM, DEC_HOST_NUM;
}
