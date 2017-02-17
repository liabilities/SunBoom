package service.impl;

import dao.FellowDAO;
import dao.GroupDAO;
import dao.LetterDAO;
import dao.impl.FellowDAOImpl;
import dao.impl.GroupDAOImpl;
import dao.impl.LetterDAOImpl;
import model.GroupModel;
import model.Letter;
import pojo.Fellow;
import pojo.Group;
import service.FellowService;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;
import utilities.exceptions.NullException;
import utilities.tool.ChineseToEnglish2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 * Created by lenovo on 2017/2/7.
 */
public class FellowServiceImpl implements FellowService{

    public List<GroupModel> getFellows(String groupID) throws NotExistException {
        FellowDAO dao = new FellowDAOImpl();
        List<Fellow> list = dao.findByProperty("fellowID",Integer.parseInt(groupID));
        GroupDAO groupDAO = new GroupDAOImpl();
        List<Group> groups = new ArrayList<Group>();
        for(Fellow fellow : list){
            groups.add(groupDAO.getById(fellow.getFollowedID()));
        }
        List<GroupModel> models = new ArrayList<GroupModel>();
        String capital;
        char temp;
        for(Group group: groups){
            capital = ChineseToEnglish2.getFullSpell(group.getName()).substring(0,1).toLowerCase();
            temp = capital.charAt(0);
            if(temp < 'a' || temp > 'z')
                capital = "0";
            models.add(new GroupModel(group.getName(),group.getGroupID()+"",group.getAvatar(),capital));
        }
        Collections.sort(models);
        return models;
    }

    public List<String> getFellowList(String groupID) throws NotExistException{
        FellowDAO dao = new FellowDAOImpl();
        List<Fellow> list = dao.findByProperty("fellowID",Integer.parseInt(groupID));
        List<String> ss = new ArrayList<String>();
        for(Fellow fellow : list){
            ss.add(fellow.getFollowedID()+"");
        }
        return ss;
    }

    public List<Letter> getMessageByID(String ID1, String ID2) throws NotExistException{
        LetterDAO dao = new LetterDAOImpl();
        List<pojo.Letter> list = dao.findByProperty("senderID",Integer.parseInt(ID1));
        List<Letter> res = new ArrayList<Letter>();
        for(pojo.Letter privateLetter : list){
            if(privateLetter.getReceiverID() == Integer.parseInt(ID2))
                res.add(new Letter(privateLetter.getLetterID()+"",privateLetter.getSenderID()+"",
                privateLetter.getReceiverID()+"",privateLetter.getTime(),
                        privateLetter.getType(),privateLetter.getContent()));
        }
        return res;
    }

    public Letter sendMessage(String message, String ID1, String ID2) throws NullException, NotExistException{
        GroupDAO dao = new GroupDAOImpl();
        Letter privateLetter = new Letter();
        privateLetter.setContent(message);
        privateLetter.setSenderGroupID(ID1);
        privateLetter.setReceiverGroupID(ID2);
        privateLetter.setSendTime(Calendar.getInstance().getTime());
        saveMessage(privateLetter);
        return privateLetter;
    }

    public ResultMsg saveMessage(Letter message) throws NullException{

        if(message == null) throw  new NullException();

        LetterDAO dao = new LetterDAOImpl();
        boolean b = dao.insertOne(new pojo.Letter(message));
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public ResultMsg deleteMessage(Letter message) throws NullException, NotExistException{

        if(message == null) throw  new NullException();

        LetterDAO dao = new LetterDAOImpl();
        boolean b = dao.deleteOne(Integer.parseInt(message.getPrivateLetterID()));
        if(b) return  ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public Letter transmitMessage(String message, String ID1, String ID2) throws NullException, NotExistException{
        return sendMessage(message, ID1, ID2);
    }

    public ResultMsg addFellow(String ID1, String name) throws NotExistException{
        FellowDAO dao = new FellowDAOImpl();
        GroupDAO groupDAO = new GroupDAOImpl();
        List<Fellow> fellowsList = dao.findByProperty("fellowID",Integer.parseInt(ID1));
        List<Group> list = groupDAO.findByProperty("name",name);

        //TODO 有一个问题就是fellowID是关注者ID，数据库fellow表中应该可以重复，但是fellowID作为主键就不可以重复了，我理解有误？

        Group group = new Group();
        Fellow fellow = new Fellow();
        for(int i = 0; i < list.size(); i++){

            if(fellowsList.size() == 0){
                group = list.get(i);
                fellow.setFellowID(Integer.parseInt(ID1));
                fellow.setFollowedID(group.getGroupID());
                fellow.setType(1);
                boolean b = dao.insertOne(fellow);
                if (b) return ResultMsg.SUCCESS;
            }

            for(int j = 0; j < fellowsList.size(); j++){
                group = list.get(i);
                fellow = fellowsList.get(j);

                if(fellow.getFollowedID() != group.getGroupID()) {
                    fellow.setFellowID(Integer.parseInt(ID1));
                    fellow.setFollowedID(group.getGroupID());
                    fellow.setType(1);
                    boolean b = dao.insertOne(fellow);
                    if (b) return ResultMsg.SUCCESS;
                }
            }
        }
        return ResultMsg.FAIL;
    }

    public ResultMsg deleteFellow(String ID1, String name) throws NotExistException{
        FellowDAO dao = new FellowDAOImpl();
        GroupDAO groupDAO = new GroupDAOImpl();
        List<Fellow> fellowsList = dao.findByProperty("fellowID",Integer.parseInt(ID1));
        List<Group> list = groupDAO.findByProperty("name",name);

        for(Group group : list){
            for(Fellow fellow : fellowsList){
                if(fellow.getFollowedID() == group.getGroupID()){
                    boolean b = dao.deleteOne(fellow.getFollowedID());
                    if(b) return ResultMsg.SUCCESS;
                }
            }
        }
        return ResultMsg.FAIL;
    }

    public List<String> searchFellow(String ID1, String keyword) throws NotExistException{
        FellowDAO dao = new FellowDAOImpl();
        List<Fellow> fellowsList = dao.findByProperty("fellowID",Integer.parseInt(ID1));
        GroupDAO groupDAO = new GroupDAOImpl();
        List<String> list = new ArrayList<String>();
        for(Fellow fellow : fellowsList){
            if(groupDAO.getById(fellow.getFollowedID()).getIntroduction().contains(keyword))
                list.add(groupDAO.getById(fellow.getFollowedID()).getGroupID()+"");
        }
        return list;
    }
}
