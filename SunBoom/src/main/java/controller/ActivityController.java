package controller;

import model.ActivityGeneralModel;
import model.ActivityModel;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.activityService.ActivityService;
import service.impl.ActivityServiceImpl;
import utilities.enums.ActivityInitiatorType;
import utilities.enums.ActivityState;
import utilities.enums.Place;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
//        System.out.println("newActivity");
//        System.out.println(request.getParameter("name"));
//        System.out.println(request.getParameter("brief"));
//        System.out.println(ActivityInitiatorType.getEnum(Integer.parseInt(request.getParameter("initiatorType"))));
//        System.out.println(Integer.parseInt(request.getParameterValues("scale[]")[0]));
//        System.out.println(Integer.parseInt(request.getParameterValues("scale[]")[1]));
//        System.out.println(String.join(",", request.getParameterValues("activityType[]")));
//        System.out.println(Place.getEnum(Integer.parseInt(request.getParameter("place"))));
//        System.out.println(request.getParameter("YYYY") + " " + request.getParameter("MM") + " " + request.getParameter("DD"));
//        System.out.println(request.getParameter("YYYY2") + " " + request.getParameter("MM2") + " " + request.getParameter("DD2"));
//        System.out.println(new Date(Integer.parseInt(request.getParameter("YYYY")), Integer.parseInt(request.getParameter("MM")), Integer.parseInt(request.getParameter("DD"))));
//        System.out.println(new Date(Integer.parseInt(request.getParameter("YYYY2")), Integer.parseInt(request.getParameter("MM2")), Integer.parseInt(request.getParameter("DD2"))));
        ActivityModel am = new ActivityModel(request.getParameter("name"), "0",
                ActivityInitiatorType.getEnum(Integer.parseInt(request.getParameter("initiatorType"))),
                Integer.parseInt(request.getParameterValues("scale[]")[0]), Integer.parseInt(request.getParameterValues("scale[]")[1]),
                String.join(",", request.getParameterValues("activityType[]")), Place.getEnum(Integer.parseInt(request.getParameter("place"))),
                new Date(Integer.parseInt(request.getParameter("YYYY")) - 1900,
                        Integer.parseInt(request.getParameter("MM")), Integer.parseInt(request.getParameter("DD"))),
                new Date(Integer.parseInt(request.getParameter("YYYY2")) - 1900,
                        Integer.parseInt(request.getParameter("MM2")), Integer.parseInt(request.getParameter("DD2"))),
                request.getParameter("brief"), null);
        System.out.println("constructed successfully");
        ResultMsg msg = activityService.createActivity(am);
        return "1";
    }

    @RequestMapping(value = "/gi", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String getActivities(HttpServletRequest request) {
        JSONArray array = new JSONArray();
        JSONObject result = new JSONObject();
        try {
            List<ActivityModel> list = activityService.getActivitySpecial(request.getParameter("id"),
                    ActivityState.getEnum(Integer.parseInt(request.getParameter("state"))));
            for (ActivityModel item: list) {
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
