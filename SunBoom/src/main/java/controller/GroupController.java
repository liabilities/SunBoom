package controller;

import model.GroupModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.GroupHomeService;
import service.impl.GroupHomeServiceImpl;
import utilities.exceptions.NotExistException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by I Like Milk on 2017/1/11.
 */
@Controller
public class GroupController {

    @RequestMapping(value = "/getGroupInfo", method = RequestMethod.GET)
    @ResponseBody
    public String getGroupInfo(String id) {
        System.out.println("call");
            System.out.println(id);
            GroupHomeService service = new GroupHomeServiceImpl();
            GroupModel model = null;
            try {
                model = service.getBasicInfo(id);
            } catch (NotExistException e) {
                e.printStackTrace();
            }
            System.out.println("call2");
            String result = "<GROUP>";
            if (model != null) {
            result += "<NAME>" + model.getName() + "</NAME>";
            result += "<SIGNATURE>" + model.getSignature() + "</SIGNATURE>";
            result += "<MEMBERNUM>" + model.getMemberNum() + "</MEMBERNUM>";
            result += "<SCHOOL>" + model.getSchoolID() + "</SCHOOL>";
            result += "<TAG>" + model.getTag() + "</TAG>";
            result += "<AVATAR>" + model.getAvatar() + "</AVATAR>";
        }
        result += "</GROUP>";
        System.out.println("call3");
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/getAvatar", method = RequestMethod.GET)
    @ResponseBody
    public String getAvatar() {
        System.out.println("2");
        return "<p>456</p>";
    }
}
