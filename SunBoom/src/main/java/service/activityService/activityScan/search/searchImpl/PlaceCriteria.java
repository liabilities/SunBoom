package service.activityService.activityScan.search.searchImpl;

import pojo.Activity;
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
    public List<Activity> meetCriteria(List<Activity> activities) {
        return null;
    }
}
