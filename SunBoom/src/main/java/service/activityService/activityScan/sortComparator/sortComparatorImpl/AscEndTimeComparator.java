package service.activityService.activityScan.sortComparator.sortComparatorImpl;

import model.ActivityModel;

import java.util.Comparator;

/**
 * Created by cuihua on 2017/2/18.
 */
public class AscEndTimeComparator implements Comparator<ActivityModel> {

    @Override
    public int compare(ActivityModel o1, ActivityModel o2) {
        if (o1.endTime.before(o2.endTime)) {
            return -1;
        } else if (o1.endTime.after(o2.endTime)) {
            return 1;
        } else return 0;
    }
}
