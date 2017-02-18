package model;

import utilities.enums.ActivityInitiatorType;
import utilities.enums.ActivityType;
import utilities.enums.Place;

/**
 * Created by cuihua on 2017/2/18.
 *
 *
 */
public class ActivitySearchCreteriaModel {


    public String name;

    public ActivityInitiatorType activityInitiatorType;

    public ActivityType type;

    public Place place;

    public ActivitySearchCreteriaModel(String name, ActivityInitiatorType activityInitiatorType, ActivityType type, Place place) {
        this.name = name;
        this.activityInitiatorType = activityInitiatorType;
        this.type = type;
        this.place = place;
    }
}
