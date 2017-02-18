package controller;

import model.GroupInf;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Group;
import service.LoginService;
import service.impl.LoginServiceImpl;
import utilities.enums.ResultMsg;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    // 个人用户登录
    @RequestMapping(value = "/Login_User", method = RequestMethod.POST)
    @ResponseBody
    public String LoginUser(String userName, String password) {
        LoginService loginService = new LoginServiceImpl();
        ResultMsg state=loginService.loginUser(userName, password);
        return state.getMessage();
    }

    // 注册
    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    @ResponseBody
    public String Register(HttpServletRequest request, String userName, String password) {

//        LoginService loginService = new LoginServiceImpl();
//        ResultMsg state = loginService.addUser(userId, password, Power.valueOf(power));
//
//        if (state == ResultMsg.SUCCESS) {
//            UserModel userModel = new UserModel();
//            userModel.setId(userId);
//            userModel.setMessageNum(0);
//            userModel.setPower(Power.valueOf(power));
//            request.getSession().setAttribute("User", userModel);
//        }

//        return String.valueOf(state);
        return "Success";
    }

    //退出登录
    @RequestMapping(value = "/Logout", method = RequestMethod.GET)
    public String Register(HttpServletRequest request) {
        request.getSession().setAttribute("User", null);
        return "HomePage";
    }

    // 团队用户登录
    @RequestMapping(value = "/Login_Group", method = RequestMethod.POST)
    @ResponseBody
    public String LoginGroup(HttpServletRequest request,String groupName, String password) {
        LoginService loginService = new LoginServiceImpl();
        GroupInf inf=loginService.loginGroup(groupName, password);
        if(inf==null){
            return "fail";
        }
        request.getSession().setAttribute("group", inf);
        return "success";

    }


}
