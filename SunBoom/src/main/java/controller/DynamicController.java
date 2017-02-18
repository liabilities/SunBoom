package controller;

import model.Dynamic;
import model.DynamicComment;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DynamicsService;
import service.impl.DynamicsServiceImpl;
import utilities.exceptions.NotExistException;

import java.util.List;

/**
 * Created by Dell on 2017/2/18.
 */
@Controller
public class DynamicController {
    DynamicsService service=new DynamicsServiceImpl();
    @RequestMapping(value = "/getDynamic",method = RequestMethod.POST)
    @ResponseBody
    public String getDynamic(String userName){
        List<Dynamic> dynamicList=null;
        try{
             dynamicList=service.getDynamicListByName(userName);
        }catch (NotExistException e){
            e.printStackTrace();
        }
        JSONObject jsonObject=new JSONObject();
        JSONArray jsonArray=new JSONArray();

        if(dynamicList!=null){
            for(Dynamic d:dynamicList){
                JSONObject j=new JSONObject();
                j.put("time",d.publishTime.toString());
                j.put("name",d.getGroupname());
                j.put("avatar",d.avatar);
                j.put("content",d.getContent());
                j.put("likeNum",d.getLikeNumbers());
                JSONArray array=new JSONArray();
                for(DynamicComment c:d.getComments()){
                    JSONObject jc=new JSONObject();
                    jc.put("name",c.getRepliedGroupName());
                    jc.put("time",c.getSendTime().toString());
                    jc.put("content",c.getContent());
                    array.put(jc);
                }
                j.put("comments",array);
                jsonArray.put(j);
            }
            jsonObject.put("dynamics",jsonArray);
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/republish",method = RequestMethod.POST)
    @ResponseBody
    public String republish(){
        return "";
    }



}
