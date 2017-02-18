package service.activityService.activityScan.search.searchImpl;

import pojo.Activity;
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
    public List<Activity> meetCriteria(List<Activity> activities) {
        return null;
    }
}
