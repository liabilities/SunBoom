package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by I Like Milk on 2017/1/11.
 */
@Controller
public class GroupController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("info");
        model.addObject("username", request.getParameter("username"));
        model.addObject("password", request.getParameter("password"));
        return model;
    }
}
