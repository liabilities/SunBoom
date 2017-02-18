package service.impl;

import dao.GroupDAO;
import dao.impl.GroupDAOImpl;
import model.GroupInf;
import pojo.Group;
import pojo.User;
import service.LoginService;
import utilities.enums.ResultMsg;

import java.util.List;

/**
 * Created by zs on 2017/2/9.
 */
public class LoginServiceImpl implements LoginService {

    public ResultMsg addUser(String userName, String password) {
        return ResultMsg.SUCCESS;
    }

    public ResultMsg loginUser(String userName, String password) {
        return ResultMsg.SUCCESS;
    }

    public GroupInf loginGroup(String groupName, String password) {
        GroupDAO dao = new GroupDAOImpl();
        Group group = null;
        List<Group> list = null;
        GroupInf inf = new GroupInf();
        try {
            list = dao.findByProperty("userName",groupName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        if (list.isEmpty()) {
            System.out.println("该账号不存在请重新输入");
            return null;
        }
        group=list.get(0);
        if(password.contains("=")){
            System.out.println("恶意攻击");
            return null;
        }
        if (!group.getPassword().equals(password)) {
            System.out.println("密码不对哟，看看大小写输对了没");
            return null;
        }
//        System.out.print(group.getName()+" "+group.getUsername());
        inf.setName(group.getName());
        inf.setSchoolID(group.getSchoolID()+"");
        inf.setGroupID(group.getGroupID()+"");
        inf.setUserName(group.getUsername());
        return inf;
    }

    //main测试
    public static void main(String[] args) {
        LoginService u=new LoginServiceImpl();
       // ResultMsg state=u.addUser("sha","123123",);
        GroupInf state1=u.loginGroup("se@nju","141001");
        //System.out.print(state.getMessage());
        System.out.print(state1.toString());
    }
}
