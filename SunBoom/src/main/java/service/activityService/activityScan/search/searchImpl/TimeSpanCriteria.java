package service.activityService.activityScan.search.searchImpl;

import model.ActivityModel;
import service.activityService.activityScan.search.SearchCriteria;

import java.util.Date;
import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class TimeSpanCriteria implements SearchCriteria {

    private Date targetStartTime;
    private Date targetEndTime;

    public TimeSpanCriteria(Date targetStartTime, Date targetEndTime) {
        this.targetStartTime = targetStartTime;
        this.targetEndTime = targetEndTime;
    }

    @Override
    public List<ActivityModel> meetCriteria(List<ActivityModel> activities) {
        for (int i = 0; i < activities.size();) {
            if (!(activities.get(i).startTime.after(targetStartTime) && activities.get(i).endTime.before(targetEndTime))) {
                activities.remove(i);
            }
            i++;
        }
        return activities;
    }
}
