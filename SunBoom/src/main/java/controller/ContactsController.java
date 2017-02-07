package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
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
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        map.put("contactList",list);
        return map;
    }
}
