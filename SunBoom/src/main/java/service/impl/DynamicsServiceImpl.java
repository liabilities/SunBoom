package service.impl;

import dao.DynamicCommentDAO;
import dao.DynamicDAO;
import dao.GroupDAO;
import dao.impl.DynamicCommentDAOImpl;
import dao.impl.DynamicDAOImpl;
import dao.impl.GroupDAOImpl;
import model.Dynamic;
import model.DynamicComment;
import pojo.Group;
import service.DynamicsService;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lenovo on 2017/2/9.
 */
public class DynamicsServiceImpl implements DynamicsService {

    public ResultMsg pulish(Dynamic dy) throws NotExistException{
        DynamicDAO dao = new DynamicDAOImpl();
        pojo.Dynamic dynamic = new pojo.Dynamic(dy);

        GroupDAO groupDAO = new GroupDAOImpl();

        //TODO 图片组的存储
        //File file = new File("D:\\SunBoomBoom\\"+groupDAO.getById(dynamic.getPublisherID()).getName()+"\\dynamic");
        //if(!file.exists())
            //file.mkdirs();

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

    public List<Dynamic> getDynamicListByName(String groupname) throws NotExistException{

        GroupDAO groupDAO = new GroupDAOImpl();
        Group group = groupDAO.findByProperty("name",groupname).get(0);

        //所需动态的用户ID
        List<String> groupsID = new FellowServiceImpl().getFellowList(group.getGroupID()+"");
        groupsID.add(group.getGroupID()+"");

        //所需的所有动态
        DynamicDAO dao = new DynamicDAOImpl();
        List<pojo.Dynamic> dynamics = new ArrayList<pojo.Dynamic>();
        for(String groupID : groupsID){
            for(pojo.Dynamic d : dao.findByProperty("publisherID",Integer.parseInt(groupID))){
                dynamics.add(d);
            }
        }

        //装载动态所需信息
        DynamicCommentDAO dynamicCommentDAO = new DynamicCommentDAOImpl();
        List<Dynamic> list = new ArrayList<Dynamic>();;
        List<DynamicComment> comments = new ArrayList<DynamicComment>();
        Dynamic temp;
        for(pojo.Dynamic dynamic : dynamics){
            temp = new Dynamic(dynamic);
            temp.setGroupname(groupname);
            temp.setAvatar(group.getAvatar());

            if(dynamic.getPictureNum() != 0){
                List<String> pictures = new ArrayList<String>(dynamic.getPictureNum());
                temp.setPictures(pictures);
            }else{
                temp.setPictures(null);
            }

            comments = new DynamicsServiceImpl().getDynamicComment(dynamic.getDynamicID()+"");
            Collections.sort(comments);
            temp.setComments(comments);

            list.add(temp);
        }

        Collections.sort(list);

        return list;
    }

    public ResultMsg replyDynamic(DynamicComment dynamicComment) {
        DynamicCommentDAO dao = new DynamicCommentDAOImpl();
        pojo.DynamicComment dyC = new pojo.DynamicComment(dynamicComment);
        boolean b = dao.insertOne(dyC);
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public int like(int dynamicID) throws  NotExistException{
        //TODO 这样可以重复点赞了欸...
        DynamicDAO dao = new DynamicDAOImpl();
        pojo.Dynamic dynamic = dao.getById(dynamicID);
        dynamic.setLikeNum(dynamic.getLikeNum()+1);
        boolean b = dao.updateOne(dynamic);
        if(b) return dynamic.getLikeNum();
        return 0;
    }

    public List<DynamicComment> getDynamicComment(String dynamicID) throws NotExistException{
        List<DynamicComment> list = new ArrayList<DynamicComment>();
        DynamicCommentDAO dynamicCommentDAO = new DynamicCommentDAOImpl();
        GroupDAO groupDAO = new GroupDAOImpl();
        List<pojo.DynamicComment> lists = dynamicCommentDAO.findByProperty("dynamicID",Integer.parseInt(dynamicID));
        DynamicComment com;
        for(pojo.DynamicComment comment : lists){
            com = new DynamicComment(comment);
            com.setRepliedGroupName(groupDAO.getById(comment.getReceiverID()).getUsername());
            com.setReplyGroupName(groupDAO.getById(comment.getSenderID()).getUsername());
            list.add(com);
        }
        return list;
    }

}
