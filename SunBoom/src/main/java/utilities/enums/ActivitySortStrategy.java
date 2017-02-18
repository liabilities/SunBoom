package utilities.enums;

/**
 * Created by cuihua on 2017/2/18.
 */
public enum ActivitySortStrategy {

    // 开始时间升序， 开始时间倒序，结束时间升序，结束时间倒序，
    // 最小规模升序，最小规模降序，最大规模升序，最大规模降序，
    // 关注人数升序，关注人数降序，点赞人数升序，点赞人数降序
    ASC_START_TIME, DEC_START_TIME, ASC_END_TIME, DEC_END_TIME,
    ASC_MIN_SCALE, DEC_MIN_SCALE, ASC_MAX_SCALE, DEC_MAX_SCALE,
    ASC_FELLOW, DEC_FELLOW, ASC_LIKE, DEC_LIKE;
}
