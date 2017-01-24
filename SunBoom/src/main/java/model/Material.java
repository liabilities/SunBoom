package model;

import java.util.List;

/**
 * 物资
 * Created by lenovo on 2017/1/13.
 */
public class Material {

    /**
     * 物资ID
     */
    public String materialID;

    /**
     * 物资名称
     */
    public String materialName;

    /**
     * 物资数量
     */
    public int materialNumber;

    /**
     * 物资类别
     */
    public String materialType;

    /**
     * 物资描述
     */
    public String materialDetail;

    /**
     * 物资出租价格
     */
    public double rentPrice;

    /**
     * 物资所属组织
     */
    public String groupID;

    /**
     * 图片（5张以内）
     */
    public List<String> pictures;

    public Material(String materialID,String materialName,int materialNumber,String materialType,
                    String materialDetail,double rentPrice,String groupID,List<String> pictures){
        this.materialID = materialID;
        this.materialName = materialName;
        this.materialNumber = materialNumber;
        this.materialType = materialType;
        this.materialDetail = materialDetail;
        this.rentPrice = rentPrice;
        this.groupID = groupID;
        this.pictures = pictures;
    }

}
