package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by I Like Milk on 2017/1/11.
 */
@Controller
public class GroupController {

    @RequestMapping(value = "/getGroup", method = RequestMethod.GET)
    @ResponseBody
    public String getGroupInfo() {
        return "<p>123</p>";
    }

    @RequestMapping(value = "/getAvatar", method = RequestMethod.GET)
    @ResponseBody
    public String getAvatar() {
        return "<p>456</p>";
    }
}
