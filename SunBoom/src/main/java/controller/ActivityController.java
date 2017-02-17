package controller;

import model.ActivityGeneralModel;
import model.ActivityModel;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ActivityService;
import service.impl.ActivityServiceImpl;
import utilities.enums.ActivityState;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by I Like Milk on 2017/2/17.
 */

@Controller
public class ActivityController {
    private ActivityService activityService;

    public ActivityController() {
        activityService = new ActivityServiceImpl();
    }

    @RequestMapping(value = "/na", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String newActivity(HttpServletRequest request) {

        return "1";
    }

    @RequestMapping(value = "/gi", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String getActivities(HttpServletRequest request) {
        JSONArray array = new JSONArray();
        JSONObject result = new JSONObject();
        try {
            List<ActivityGeneralModel> list = activityService.getActivitySpecial(request.getParameter("id"),
                    ActivityState.getEnum(Integer.parseInt(request.getParameter("state"))));
            for (ActivityGeneralModel item: list) {
                JSONObject json = new JSONObject();
                json.put("name",item.name);
                json.put("minScale", item.minScale);
                json.put("maxScale", item.maxScale);
                json.put("type", item.type);
                json.put("place", item.place);
                json.put("startTime", item.startTime);
                array.put(json);
            }
        } catch (NotExistException e) {
            e.printStackTrace();
        }
        result.put("activities", array);
        return result.toString();
    }
}
