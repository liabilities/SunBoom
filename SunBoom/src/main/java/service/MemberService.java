package service;

import model.PersonModel;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface MemberService {

    /**
     * 获取成员列表
     * @param groupID 团队ID
     * @return 成员的昵称列表
     */
    public List<String> getMemberList(String groupID) throws NotExistException;

    /**
     * 获取成员列表:用户名，昵称，邮箱，加入时间
     * @param groupID
     * @return
     * @throws NotExistException
     */
    public List<PersonModel> getMemberListInfo(String groupID) throws NotExistException;

    /**
     * 删除成员
     * @param personName 成员姓名
     * @return ResultMsg
     */
    public ResultMsg deleteMember(String groupID, String personName) throws NotExistException;

    /**
     * 生成邀请码
     * @param groupID
     * @return 8位乱码邀请码
     */
    public String generateCode(String groupID) throws NotExistException;

    /**
     * 添加成员
     * @param personID 成员ID
     * @return ResultMsg
     */
    public ResultMsg addMember(String groupID, String personID) throws NotExistException;

    /**
     * 获取头像
     * @param personName
     * @return
     */
    public String getAvatar(String personName) throws NotExistException;

}
