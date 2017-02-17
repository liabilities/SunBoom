package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zoetx on 2017/2/8.
 */
@Controller
public class MemberController {
    @RequestMapping(value = "/getMembers",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getMembers(String id){
        System.out.println(id);
        Map<String,Object> map=new HashMap();
        ArrayList<String> userName=new ArrayList<String>();
        ArrayList<String> nickName=new ArrayList<String>();
        ArrayList<String> mail=new ArrayList<String>();
        ArrayList<String> inTime=new ArrayList<String>();
        userName.add("xiaota");
        nickName.add("xiaota");
        mail.add("xiaota");
        inTime.add("xiaota");
        map.put("userNames",userName);
        map.put("nickNames",nickName);
        map.put("mails",mail);
        map.put("inTimes",inTime);
        return map;
    }

    @RequestMapping(value = "/findMember",method =RequestMethod.POST)
    @ResponseBody
    public String findMember(String userName){
        System.out.print(userName);
        return "../../img/1.png ";
    }

    @RequestMapping(value = "/findCode",method =RequestMethod.POST)
    @ResponseBody
    public String findCode(){
        return "";
    }
}
