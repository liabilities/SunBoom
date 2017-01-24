package pojo;

import utilities.enums.NetWorkingState;
import utilities.enums.ParticipantRange;
import utilities.enums.Place;

import java.awt.*;
import java.io.File;
import java.time.LocalDateTime;

/**
 * Created by cuihua on 2017/1/11.
 */
public class Networking {

    private int networkingID;

    private String name;

    private String type;

    private Place place;

    private int groupID;

    private ParticipantRange participantRange;

    private NetWorkingState networkingNetWorkingState;

    private LocalDateTime announceTime;

    private LocalDateTime respondingEndTime;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDateTime lastUpdateTime;

    private String introduction;

    private Image introPhoto;

    //!!!!!图文详情，二进制文件，微信编辑框。。。。
    private File detail;

    private int minScale;

    private int maxScale;

    private int memberNum;



}
