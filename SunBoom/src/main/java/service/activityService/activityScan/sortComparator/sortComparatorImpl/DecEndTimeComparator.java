package service.activityService.activityScan.sortComparator.sortComparatorImpl;

import model.ActivityModel;
import pojo.Activity;

import java.util.Comparator;

/**
 * Created by cuihua on 2017/2/18.
 */
public class DecEndTimeComparator implements Comparator<ActivityModel> {

    @Override
    public int compare(ActivityModel o1, ActivityModel o2) {
        if (o2.endTime.before(o1.endTime)) {
            return -1;
        } else if (o2.endTime.after(o1.endTime)) {
            return 1;
        } else return 0;
    }
}