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
import utilities.exceptions.NotExistException;
import utilities.exceptions.SafeException;
import utilities.exceptions.WrongException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;


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
        request.getSession().setAttribute("group", null);
        return "HomePage";
    }

    // 团队用户登录
    @RequestMapping(value = "/Login_Group", produces="text/html;charset=UTF-8;", method = RequestMethod.POST)
    @ResponseBody
    public String LoginGroup(HttpServletRequest request, HttpServletResponse response,String groupName, String password) {
        try {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        LoginService loginService = new LoginServiceImpl();
        GroupInf inf = null;
        try {
            inf=loginService.loginGroup(groupName, password);
        }catch(NotExistException e){
            return "该账号不存在请重新输入";
        }catch(SafeException e){
            return "恶意攻击";
        }catch(WrongException e){
            return "密码错误请重新输入";
        }
        request.getSession().setAttribute("group", inf);
        return "success";

    }


}
