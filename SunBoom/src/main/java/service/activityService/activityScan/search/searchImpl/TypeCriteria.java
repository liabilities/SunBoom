package service.activityService.activityScan.search.searchImpl;

import com.sun.xml.internal.bind.v2.TODO;
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

        // TODO Charles————对Type/Tag的实现存疑
//        for (int i = 0; i < activities.size();) {
//            if (activities.get(i).type != targetType) {
//                activities.remove(i);
//            }
//            i++;
//        }
        return activities;
    }}
