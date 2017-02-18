package controller;

import model.GroupModel;
import model.Letter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FellowService;
import service.impl.FellowServiceImpl;
import utilities.exceptions.NotExistException;
import utilities.exceptions.NullException;

import java.util.*;

/**
 * Created by Dell on 2017/2/7.
 */
@Controller
public class ContactsController {
    FellowService service=new FellowServiceImpl();
    @RequestMapping(value = "/getContacts",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getContacts(String id){
 //       String id=request.getParameter("id");
        System.out.println(id);
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

    @RequestMapping(value = "/getLetter" ,method = RequestMethod.POST)
    @ResponseBody
    public String getLetter(String username1,String username2){
        List<Letter> letterList=null;
        try {
            letterList = service.getChatLog(username1, username2);
        }catch (NotExistException e){
            e.printStackTrace();
        }
        JSONArray array=new JSONArray();
        JSONObject object=new JSONObject();
        if(letterList!=null) {
            for (Letter letter : letterList) {
                JSONObject j = new JSONObject();
                j.put("sendID", letter.getSenderGroupID());
                j.put("receiveID", letter.getReceiverGroupID());
                j.put("date", letter.getSendTime().toString());
                j.put("content", letter.getContent());
                array.put(j);
            }
        }
        object.put("letter",array);
        return object.toString();
    }

    @RequestMapping(value = "/sendMessage",method = RequestMethod.POST)
    @ResponseBody
    public String sendMessage(String userName1,String userName2,String content){
        Date date=null;
        try {
            date = service.sendMessage(content, userName1, userName2);
        }catch (NotExistException e){
            e.printStackTrace();
        }catch (NullException e){
            e.printStackTrace();
        }
        String res="";
        if(date!=null){
            res=date.toString();
        }
        return res;
    }

}
