package service.activityService.activityScan.search.searchImpl;

import model.ActivityModel;
import service.activityService.activityScan.search.SearchCriteria;
import utilities.enums.ActivityInitiatorType;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class InitiatorTypeCriteria implements SearchCriteria {

    private ActivityInitiatorType targetActivityInitiatorType;

    public InitiatorTypeCriteria(ActivityInitiatorType targetActivityInitiatorType) {
        this.targetActivityInitiatorType = targetActivityInitiatorType;
    }


    @Override
    public List<ActivityModel> meetCriteria(List<ActivityModel> activities) {
        for (int i = 0; i < activities.size();) {
            if (activities.get(i).initiatorType != targetActivityInitiatorType) {
                activities.remove(i);
            }
            i++;
        }
        return activities;
    }
}
