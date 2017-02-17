package controller;

import model.PersonModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MemberService;
import service.impl.MemberServiceImpl;
import utilities.exceptions.NotExistException;

import java.util.List;

/**
 * Created by zoetx on 2017/2/8.
 */
@Controller
public class MemberController {
    MemberService service=new MemberServiceImpl();
    @RequestMapping(value = "/getMembers",method = RequestMethod.POST)
    @ResponseBody
    public String getMembers(String id){
        System.out.println(id);
        List<PersonModel> memberList=null;
        String res="";
        try{
            memberList=service.getMemberListInfo(id);
        }catch (NotExistException e){
            e.printStackTrace();
        }
        if(memberList!=null&&memberList.size()>0){
            res="{ \"member\": [";
            for(int i=0;i<memberList.size()-1;i++){
                PersonModel p=memberList.get(i);
                res+="{ \"userName\": "+"\""+p.getUsername()+"\""+", \"nickName\":"+"\""+p.getNickname()+"\""+", \"email\": "+"\""+p.getEmail()+"\""+",\"time\":"+"\""+p.getAddTime()+"\""+" },";
            }
            PersonModel p=memberList.get(memberList.size()-1);
            res+="{ \"userName\": "+"\""+p.getUsername()+"\""+", \"nickName\":"+"\""+p.getNickname()+"\""+", \"email\": "+"\""+p.getEmail()+"\""+",\"time\":"+"\""+p.getAddTime()+"\""+" }"+"]}";
        }
        System.out.println(res);
        return res;
    }

    @RequestMapping(value = "/findMember",method =RequestMethod.POST)
    @ResponseBody
    public String findMember(String userName){
        System.out.print(userName);
//        String avatar=null;
//        try {
//            avatar = service.getAvatar(userName);
//        }catch (NotExistException e){
//            e.printStackTrace();
//        }
//        if(avatar!=null)
//            return avatar;
        return "../../img/1.png ";
    }

    @RequestMapping(value = "/findCode",method =RequestMethod.GET)
    @ResponseBody
    public String findCode(){
        return "dfad";
    }
}
