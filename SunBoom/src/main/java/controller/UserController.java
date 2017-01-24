//package controller;
//
//import model.UserInf;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//
///**
// * Created by zs on 2016/7/13.
// */
//@Controller
//public class UserController {
//    //获取随机的8个用户
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public String test() {
//        return "test";
//    }
//    //TODO 四个不同板块的用户推荐
//
//    //个人中心-用户信息
//    @RequestMapping(value = "/users")
//    public ModelAndView getUser(String id){
//        String userId=id;
//        UserService userService = new UserServiceImpl();
//        UserInf inf=userService.getUserInf(userId);
//        if(inf==null)
//            System.out.print("null");
//        ModelAndView model=new ModelAndView("index");
//        model.addObject("inf",inf.getId());
//        return model;
//    }
//    //修改用户信息
//    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
//    @ResponseBody
//    public String updateUser(HttpServletRequest request) {
//        //获得信息
//        String id = request.getParameter("id");
//        String email = request.getParameter("email");
//        String sex = request.getParameter("sex");
//        String phone = request.getParameter("phone");
//        String blog = request.getParameter("blog");
//        String address = request.getParameter("address");
//        //转换信息
//        UserInf inf = new UserInf();
//        inf.setId(id);
//        inf.setEmail(email);
//        inf.setSex(sex);
//        inf.setPhone(phone);
//        inf.setBlog(blog);
//        inf.setAddress(address);
//        //调用更新
//        UserService user = new UserServiceImpl();
//        UniversalState state = user.update(inf);
//        if (state == UniversalState.SUCCESS)
//            return "SUCCESS";
//        return "FAIL";
//    }
//
//    @RequestMapping(value = "/getHeadPortraits", method = RequestMethod.POST)
//    @ResponseBody
//    public String getHeadPortraits(String userID) {
//        UserService userService = new UserServiceImpl();
//       return userService.getHeadPortraits(userID);
//    }
//
//    //搜索好友
//    @RequestMapping(value = "/searchUserList", method = RequestMethod.POST)
//    @ResponseBody
//    public ArrayList<UserModel> searchUserList(String key){
//        UserService service=new UserServiceImpl();
//        ArrayList<UserModel> models=service.searchUserList(key);
//        return models;
//    }
//
//}
