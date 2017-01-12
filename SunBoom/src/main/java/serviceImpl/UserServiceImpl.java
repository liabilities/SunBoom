package serviceImpl;

import Dao.UserDao;
import DaoImpl.UserDaoImpl;
import POJO.User;
import model.UserInf;
import model.UserModel;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zs on 2016/7/10.
 */
public class UserServiceImpl implements UserService {
    public UserModel getUser(String userid){
        UserModel model=new UserModel();
        UserDao dao=new UserDaoImpl();
        User user=new User();
        User po = new User();
        po.setId(userid);
        user=dao.findUser(po);
        model.setId(user.getId());
        model.setPower(Power.valueOf(user.getUserState()));
        model.setHeadPortrait(user.getHeadPortrait());

        model.setMessageNum(5);
        return model;
    }

    public UserInf getUserInf(String userid){
        UserInf inf=new UserInf();
        UserDao dao=new UserDaoImpl();
        User user=new User();
        user.setId(userid);
        user=dao.findUser(user);

        System.out.print(user.toString());
        inf.setId(user.getId());
        inf.setPhone(user.getPhone());
        inf.setAddress(user.getAddress());
        inf.setBlog(user.getPersonalPage());
        inf.setEmail(user.getEmail());
        inf.setSex(user.getSex());
        return inf;
    }


    public List<String> getUserList(String userid){
        UserDao dao=new UserDaoImpl();
        List<String> list=dao.getAllUserId();
        list.remove(userid);
        if(list.size()<=8)
            return list;
        Random rand = new Random();
        int i=(list.size()+7)/8;
        int randNum = rand.nextInt(i);
        List<String> result=new ArrayList<String>();

        for(int j=0;j<8;j++){
            int k=(8*randNum+j)%list.size();
            String name=list.get(k);
            result.add(name);
        }
        System.out.println(result);
        return result;
    }
    //更新用户信息
    public UniversalState update(UserInf inf){
        //获得用户原信息
        UserDao dao=new UserDaoImpl();
        User user=new User();
        user.setId(inf.getId());
        user=dao.findUser(user);
        //更新信息
        user.setEmail(inf.getEmail());
        user.setSex(inf.getSex());
        user.setPersonalPage(inf.getBlog());
        user.setPhone(inf.getPhone());
        user.setAddress(inf.getAddress());
        boolean a=dao.update(user);
        if(a)
            return UniversalState.SUCCESS;
        return UniversalState.FAIL;
    }

    public String getHeadPortraits(String userid) {
        UserInf inf=new UserInf();
        UserDao dao=new UserDaoImpl();
        User user=new User();
        user.setId(userid);
        user=dao.findUser(user);
        if(user==null)
            return "../image/portrait.svg";
        return user.getHeadPortrait();
    }

    public ArrayList<UserModel> searchUserList(String key) {

        ArrayList<UserModel> result=new ArrayList<UserModel>();
        UserDao userDao=new UserDaoImpl();
        List<User> userList=userDao.getSimilarUser(key);
        for(User u:userList){
            UserModel um=new UserModel();
            um.setId(u.getId());
            um.setHeadPortrait(u.getHeadPortrait());
            result.add(um);
        }
        return result;
    }

    //测试
    public static void main(String[] args) {
        UserService u=new UserServiceImpl();
        //UserModel state=u.getUser("saige");
//        List<String> list=u.getUserList("saisai");
//        for(String s:list)
//            System.out.print(s+" ");
//        System.out.print(String.valueOf(state.getId()));
//        System.out.print(String.valueOf(state.getPower()));

        UserModel user=u.getUser("chao");
        System.out.println(user.getHeadPortrait());
    }

}
