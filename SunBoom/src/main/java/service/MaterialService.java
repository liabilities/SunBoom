package service;

import utilities.enums.ResultMsg;
import model.Material;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface MaterialService {

    /**
     * 获取物资列表
     * @return 物资列表
     */
    public List<Material> getMyMaterial();

    /**
     * 删除物资
     * @param materailID 物资ID
     * @return ResultMsg
     */
    public ResultMsg deleteMaterial(int materailID);

    /**
     * 添加物资（跳出新的物资详情的界面进行编辑）
     * @param material 物资
     * @return ResultMsg
     */
    public ResultMsg addMaterail(Material material);

    /**
     * 编辑物资详情
     * @param material 物资
     * @return ResultMsg
     */
    public ResultMsg updateMaterail(Material material);

    /**
     * 将物资状态设置为可出租
     * @param materialID 物资ID
     * @return ResultMsg
     */
    public ResultMsg rent(int materialID);

    /**
     * 将物资状态设置为不可出租
     * @param materialID 物资ID
     * @return ResultMsg
     */
    public ResultMsg disrent(int materialID);

    /**
     * 获取所有团体可出租的物资列表
     * @return 可出租的物资列表
     */
    public List<Material> getAllMaterial();

    /**
     * 按关键字搜索物资
     * @param keyword 关键字
     * @return 物资列表
     */
    public List<Material> searchMaterial(String keyword);

}
