package service.impl;

import dao.CodeDAO;
import dao.Group2MemberDAO;
import dao.PersonDAO;
import dao.impl.CodeDAOImpl;
import dao.impl.Group2MemberDAOImpl;
import dao.impl.PersonDAOImpl;
import model.PersonModel;
import pojo.Code;
import pojo.Group2Member;
import pojo.Person;
import service.MemberService;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/2/6.
 */
public class MemberServiceImpl implements MemberService {

    public List<String> getMemberList(String groupID) throws NotExistException{
        Group2MemberDAO dao = new Group2MemberDAOImpl();
        List<Group2Member> group2Members = dao.findByProperty("groupID",Integer.parseInt(groupID));
        PersonDAO personDAO = new PersonDAOImpl();
        List<String> memberList = new ArrayList<String>();
        for(int i = 0; i < group2Members.size(); i++){
            memberList.add(personDAO.getById(group2Members.get(i).getPersonID()).getNickName());
        }
        return memberList;
    }

    public List<PersonModel> getMemberListInfo(String groupID) throws NotExistException{
        Group2MemberDAO dao = new Group2MemberDAOImpl();
        List<Group2Member> group2Members = dao.findByProperty("groupID",Integer.parseInt(groupID));
        PersonDAO personDAO = new PersonDAOImpl();
        List<PersonModel> memberList = new ArrayList<PersonModel>();
        for(int i = 0; i < group2Members.size(); i++){
            PersonModel model = new PersonModel();
            model.setUsername(personDAO.getById(group2Members.get(i).getPersonID()).getUsesrname());
            model.setNickname(personDAO.getById(group2Members.get(i).getPersonID()).getNickName());
            model.setEmail(personDAO.getById(group2Members.get(i).getPersonID()).getMail());
            model.setAddTime(group2Members.get(i).getAddTime());
            memberList.add(model);
        }
        return memberList;
    }

    public ResultMsg deleteMember(String groupID, String personName) throws NotExistException{
        Group2MemberDAO dao = new Group2MemberDAOImpl();
        List<Group2Member> group2Members = dao.findByProperty("groupID",Integer.parseInt(groupID));
        PersonDAO personDAO = new PersonDAOImpl();
        boolean b = false;
        for(int i = 0; i < group2Members.size(); i++){
            if(personDAO.getById(group2Members.get(i).getPersonID()).getUsesrname().equals(personName)){
                b = dao.deleteOne(group2Members.get(i).getPersonID());
            }
        }
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public String generateCode(String groupID) throws NotExistException{
        Calendar calendar = Calendar.getInstance();
        int timeUpToDate = (int)(calendar.getTimeInMillis()/1000);
        String s = Integer.toHexString(timeUpToDate);

        CodeDAO dao = new CodeDAOImpl();

        Code code = new Code();
        code.setGroupID(Integer.parseInt(groupID));
        code.setDdl(new Date(calendar.getTimeInMillis()+120000));
        code.setCode(s);

        dao.insertOne(code);
        return Integer.toHexString(timeUpToDate);
    }

    public ResultMsg addMember(String groupID, String personID) throws NotExistException{
        Group2MemberDAO dao = new Group2MemberDAOImpl();
        Group2Member group2Member = new Group2Member();
        List<Group2Member> group2Members = dao.findByProperty("groupID",Integer.parseInt(groupID));
        for(int i = 0; i < group2Members.size(); i++){
            if(group2Members.get(i).getPersonID() == Integer.parseInt(personID))
                return ResultMsg.HASEXISTED;
        }
        group2Member.setGroupID(Integer.parseInt(groupID));
        group2Member.setPersonID(Integer.parseInt(personID));
        group2Member.setAddTime(Calendar.getInstance().getTime());
        boolean b = dao.insertOne(group2Member);
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

    public String getAvatar(String personName) throws NotExistException{
        PersonDAO personDAO = new PersonDAOImpl();
        List<Person> list = personDAO.findByProperty("usesrname",personName);
        if(list.get(0) != null)
            return list.get(0).getAvatar();
        return null;
    }
}
