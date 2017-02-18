package service.activityService.activityScan.search;

import model.ActivityModel;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public interface SearchCriteria {

    public List<ActivityModel> meetCriteria (List<ActivityModel> activities);
}
