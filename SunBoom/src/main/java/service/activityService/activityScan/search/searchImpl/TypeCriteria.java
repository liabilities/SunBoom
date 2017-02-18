package service.activityService.activityScan.search.searchImpl;

import model.ActivityModel;
import service.activityService.activityScan.search.SearchCriteria;
import utilities.enums.ActivityType;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class TypeCriteria implements SearchCriteria{

    private ActivityType targetType;

    public TypeCriteria(ActivityType targetType) {
        this.targetType = targetType;
    }


    @Override
    public List<ActivityModel> meetCriteria(List<ActivityModel> activities) {
        return null;
    }
}
