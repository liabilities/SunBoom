package service.impl;

import dao.DynamicCommentDAO;
import dao.DynamicDAO;
import dao.impl.DynamicCommentDAOImpl;
import dao.impl.DynamicDAOImpl;
import model.Dynamic;
import model.DynamicComment;
import service.DynamicsService;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/2/9.
 */
public class DynamicsServiceImpl implements DynamicsService {

    public ResultMsg pulish(Dynamic dy) {
        DynamicDAO dao = new DynamicDAOImpl();
        pojo.Dynamic dynamic = new pojo.Dynamic(dy);
        //TODO 图片组的存储
        boolean b = dao.insertOne(dynamic);
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public List<Dynamic> getDynamicList(String groupID) throws NotExistException{
        DynamicDAO dao = new DynamicDAOImpl();
        List<pojo.Dynamic> dynamics = dao.findByProperty("publisherID",Integer.parseInt(groupID));
        List<Dynamic> list = new ArrayList<Dynamic>();
        Dynamic temp;
        for(pojo.Dynamic dynamic : dynamics){
            temp = new Dynamic(dynamic);
            //TODO 图片组String
            list.add(temp);
        }
        return list;
    }

    public ResultMsg replyDynamic(DynamicComment dynamicComment) {
        DynamicCommentDAO dao = new DynamicCommentDAOImpl();
        pojo.DynamicComment dyC = new pojo.DynamicComment(dynamicComment);
        boolean b = dao.insertOne(dyC);
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public ResultMsg like(int dynamicID) throws  NotExistException{
        //TODO 这样可以重复点赞了欸...
        DynamicDAO dao = new DynamicDAOImpl();
        pojo.Dynamic dynamic = dao.getById(dynamicID);
        dynamic.setLikeNum(dynamic.getLikeNum()+1);
        boolean b = dao.updateOne(dynamic);
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

}
