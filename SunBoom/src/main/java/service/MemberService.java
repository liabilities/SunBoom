package service;

import enums.ResultMsg;

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
    public List<String> getMemberList(String groupID);

    /**
     * 删除成员
     * @param personName 成员姓名
     * @return ResultMsg
     */
    public ResultMsg deleteMember(String personName);

    /**
     * 生成邀请码
     * @return 8位乱码邀请码
     */
    public String generateCode();

    /**
     * 添加成员
     * @param personID 成员ID
     * @return ResultMsg
     */
    public ResultMsg addMember(String personID);

}
