package service.activityService.activityScan.search.searchImpl;

import model.ActivityModel;
import service.activityService.activityScan.search.SearchCriteria;
import utilities.enums.Place;

import java.util.List;

/**
 * Created by cuihua on 2017/2/18.
 */
public class PlaceCriteria implements SearchCriteria{

    private Place targetPlace;

    public PlaceCriteria(Place targetPlace) {
        this.targetPlace = targetPlace;
    }


    @Override
    public List<ActivityModel> meetCriteria(List<ActivityModel> activities) {
        for (int i = 0; i < activities.size();) {
            if (activities.get(i).place != targetPlace) {
                activities.remove(i);
            }
            i++;
        }
        return activities;
    }
}
