package service.activityService.activityScan.search.searchImpl;

import pojo.Activity;
import service.activityService.activityScan.search.SearchCriteria;
import utilities.enums.ActivityInitiatorType;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class InitiatorTypeCriteria implements SearchCriteria {

    private ActivityInitiatorType TargetActivityInitiatorType;

    public InitiatorTypeCriteria(ActivityInitiatorType targetActivityInitiatorType) {
        TargetActivityInitiatorType = targetActivityInitiatorType;
    }


    @Override
    public List<Activity> meetCriteria(List<Activity> activities) {
        return null;
    }
}
