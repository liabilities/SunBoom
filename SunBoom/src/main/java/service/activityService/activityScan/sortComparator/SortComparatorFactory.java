package service.activityService.activityScan.sortComparator;

import model.ActivityModel;
import service.activityService.activityScan.sortComparator.sortComparatorImpl.*;
import utilities.enums.ActivitySortStrategy;

import java.util.Comparator;

/**
 * Created by cuihua on 2017/2/18.
 */
public class SortComparatorFactory {

    public Comparator<ActivityModel> createComparator(ActivitySortStrategy sortStrategy) {
        if (sortStrategy == ActivitySortStrategy.ASC_START_TIME) {
            return new AscStartTimeComparator();
        } else if (sortStrategy == ActivitySortStrategy.DEC_START_TIME) {
            return new DecStartTimeComparator();
        } else if (sortStrategy == ActivitySortStrategy.ASC_END_TIME) {
            return new AscEndTimeComparator();
        } else if (sortStrategy == ActivitySortStrategy.DEC_END_TIME) {
            return new DecEndTimeComparator();
        } else if (sortStrategy == ActivitySortStrategy.ASC_MIN_SCALE) {
            return new AscMinScaleComparator();
        } else if (sortStrategy == ActivitySortStrategy.DEC_MIN_SCALE) {
            return new DecMinScaleComparator();
        } else if (sortStrategy == ActivitySortStrategy.ASC_MAX_SCALE) {
            return new AscMaxScaleComparator();
        } else if (sortStrategy == ActivitySortStrategy.DEC_MAX_SCALE) {
            return new DecMaxScaleComparator();
        } else if (sortStrategy == ActivitySortStrategy.ASC_FELLOW) {
            return new AscFellowComparator();
        } else if (sortStrategy == ActivitySortStrategy.DEC_FELLOW) {
            return new DecFellowComparator();
        } else if (sortStrategy == ActivitySortStrategy.ASC_LIKE) {
            return new AscLikeComparator();
        } else if (sortStrategy == ActivitySortStrategy.DEC_LIKE) {
            return new DecLikeComparator();
        }
        return null;
    }
}
