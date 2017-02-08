package controller;

import model.GroupModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FellowService;
import service.impl.FellowServiceImpl;
import utilities.exceptions.NotExistException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 2017/2/7.
 */
@Controller
public class ContactsController {
    @RequestMapping(value = "/getContacts",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getContacts(String id){
 //       String id=request.getParameter("id");
        System.out.println(id);
        FellowService service=new FellowServiceImpl();
        List<GroupModel> models=null;
        try {
            models = service.getFellows(id);
        }catch (NotExistException e){
            e.printStackTrace();
        }
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList<String> nameList=new ArrayList<String>();
        ArrayList<String> groupIdList=new ArrayList<String>();
        ArrayList<String> avatarList=new ArrayList<String>();
        ArrayList<String> capitalList=new ArrayList<String>();
        if(models!=null){
            for(GroupModel model:models){
                nameList.add(model.getName());
                groupIdList.add(model.getGroupID());
                avatarList.add(model.getAvatar());
                capitalList.add(model.getCapital());
                System.out.println(model.getAvatar());
            }
        }
        if(nameList.size()>0) {
            map.put("nickname", nameList);
            map.put("groupId", groupIdList);
            map.put("avatar", avatarList);
            map.put("capital", capitalList);
        }
        return map;
    }
}
