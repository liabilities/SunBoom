package service.activityService.activityScan.search.searchImpl;

import pojo.Activity;
import service.activityService.activityScan.search.SearchCriteria;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class ActivityNameCriteria implements SearchCriteria {

    private String targetName;

    public ActivityNameCriteria(String targetName) {
        this.targetName = targetName;
    }

    @Override
    public List<Activity> meetCriteria(List<Activity> activities) {
        return null;
    }
}
