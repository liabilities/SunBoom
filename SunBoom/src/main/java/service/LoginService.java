package service;

import model.GroupInf;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;
import utilities.exceptions.SafeException;
import utilities.exceptions.WrongException;

/**
 * Created by zs on 2017/2/9.
 */
public interface LoginService {
    //个人注册
    public ResultMsg addUser(String userName, String password);

    //个人登录
    public ResultMsg loginUser(String userName, String password);

    //团队登录
    public GroupInf loginGroup(String groupName, String password) throws NotExistException,SafeException,WrongException;
}
