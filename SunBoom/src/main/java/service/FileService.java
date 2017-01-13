package service;

import enums.FileState;
import enums.ResultMsg;
import model.GroupModel;
import model.UserFileModel;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface FileService {

    /**
     * 下载文件
     * @param groupID
     * @param fileID
     * @return 文件路径
     */
    public String download(String groupID, String fileID);

    /**
     * 保存用户上传的文件
     * @param file
     * @return ResultMsg
     */
    public ResultMsg uploadFile(UserFileModel file);

    /**
     * 为该ID用户新建文件夹
     * @param file
     * @return ResultMsg
     */
    public ResultMsg newFolder(UserFileModel file);

    /**
     * 根据ID获得该用户所有文件和文件夹
     * @param groupID
     * @return 文件列表
     */
    public List<UserFileModel> getAllFiles(String groupID);

    /**
     * 重命名文件或文件夹
     * @param fileID
     * @param oldName
     * @param newName
     * @return ResultMsg
     */
    public ResultMsg rename(String fileID, String oldName, String newName);

    /**
     * 为该ID用户删除指定文件或文件夹
     * @param fileID
     * @return ResultMsg
     */
    public ResultMsg delete(String fileID);

    /**
     * 复制文件到目标目录
     * @param groupID
     * @param sourceID
     * @param targetPathID
     * @return ResultMsg
     */
    public ResultMsg copyTo(String groupID, List<String> sourceID, String targetPathID);

    /**
     * 移动文件到目标目录
     * @param groupID
     * @param sourceID
     * @param targetPathID
     * @return ResultMsg
     */
    public ResultMsg moveTo(String groupID, List<String> sourceID, String targetPathID);

    /**
     * 更改文件权限
     * @param filesID
     * @param state
     * @return ResultMsg
     */
    public ResultMsg changeState(List<String> filesID, FileState state);

    /**
     * 清空回收站
     * @param groupID
     * @return ResultMsg
     */
    public ResultMsg clear(String groupID);

    /**
     * 彻底删除指定文件或文件夹
     * @param filesID
     * @return ResultMsg
     */
    public ResultMsg delete(List<String> filesID);

    /**
     * 还原文件或文件夹
     * @param filesID
     * @return ResultMsg
     */
    public ResultMsg restore(List<String> filesID);

    /**
     * 返回关注列表
     * @param goupID
     * @return 关注列表
     */
    public List<GroupModel> getFollow(String goupID);

    /**
     * 返回group的公开文件
     * @param groupID
     * @return 文件列表
     */
    public List<UserFileModel> getPublicFiles(String groupID);

    /**
     * 保存指定文件
     * @param GroupID
     * @param fileID
     * @return ResultMsg
     */
    public ResultMsg save(String GroupID, String fileID);

}
