package service.activityService.activityScan.search;

import model.ActivitySearchCreteriaModel;
import service.activityService.activityScan.search.searchImpl.*;
import utilities.enums.ActivitySearchCriteria;

/**
 * Created by cuihua on 2017/2/18.
 */
public class SearchCriteriaFactory {

    public SearchCriteria createSearchCriteria(ActivitySearchCriteria criteria, ActivitySearchCreteriaModel model) {
        if (criteria == ActivitySearchCriteria.NAME) {
            return new ActivityNameCriteria(model.name);
        } else if(criteria == ActivitySearchCriteria.INITIATOR_TYPE) {
            return new InitiatorTypeCriteria(model.activityInitiatorType);
        } else if(criteria == ActivitySearchCriteria.TYPE) {
            return new TypeCriteria(model.type);
        } else if(criteria == ActivitySearchCriteria.PLACE) {
            return new PlaceCriteria(model.place);
        } else if(criteria == ActivitySearchCriteria.TIME_SPAN) {
            return new TimeSpanCriteria(model.minDate, model.maxDate);
        }
        return new NullCriteria();
    }
}
