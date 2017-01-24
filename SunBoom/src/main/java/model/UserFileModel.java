package model;

import utilities.enums.FileState;

import java.util.Date;

/**
 * Created by lenovo on 2017/1/13.
 */
public class UserFileModel {

    public String fileID;
    public String userID;
    public String fileName;
    public String filePath;
    public FileState fileState;
    public String type;
    public String parentID;
    public Date updateTime;

    public UserFileModel(String fileID,String userID,String fileName,String filePath,
                         FileState fileState,String type,String parentID,Date updateTime){
        this.fileID = fileID;
        this.userID = userID;
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileState = fileState;
        this.type = type;
        this.parentID = parentID;
        this.updateTime = updateTime;
    }


}
