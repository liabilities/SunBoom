package service.activityService.activityScan.search;

import pojo.Activity;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public interface SearchCriteria {

    public List<Activity> meetCriteria (List<Activity> activities);
}
