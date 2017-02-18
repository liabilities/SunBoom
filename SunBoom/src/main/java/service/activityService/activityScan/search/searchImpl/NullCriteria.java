package service.activityService.activityScan.search.searchImpl;

import pojo.Activity;
import service.activityService.activityScan.search.SearchCriteria;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class NullCriteria implements SearchCriteria {


    @Override
    public List<Activity> meetCriteria(List<Activity> activities) {
        return activities;
    }
}
