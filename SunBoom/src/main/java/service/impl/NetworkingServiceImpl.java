package service.impl;

import dao.NetworkingDAO;
import dao.ResponsorDAO;
import dao.impl.NetworkingDAOImpl;
import dao.impl.ResponsorDAOImpl;
import model.GroupGeneralModel;
import model.NetworkingGeneralModel;
import model.NetworkingModel;
import pojo.Networking;
import pojo.Responsor;
import service.NetworkingService;
import utilities.enums.NetworkingState;
import utilities.enums.ResultMsg;
import utilities.enums.SearchStrategy;
import utilities.enums.SortStrategy;
import utilities.exceptions.NotExistException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuihua on 2017/2/16.
 */
public class NetworkingServiceImpl implements NetworkingService {

    NetworkingDAO networkingDAO;
    ResponsorDAO responsorDAO;

    public NetworkingServiceImpl() {
        this.networkingDAO = new NetworkingDAOImpl();
        this.responsorDAO = new ResponsorDAOImpl();
    }

    public List<NetworkingGeneralModel> defalutDisplay(String groupID) throws NotExistException {
        return convertListPo2GeneralModel(networkingDAO.findByProperty("groupID", groupID));
    }

    public NetworkingModel getNetworkingDetail(String networkingID) throws NotExistException {
        return new NetworkingModel(networkingDAO.getById(networkingID));
    }

    public ResultMsg modifyNetworking(NetworkingModel networkingModel) throws NotExistException {
        boolean result = networkingDAO.updateOne(new Networking(networkingModel));
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    public ResultMsg createNetworking(NetworkingModel newNetworkingModel) {
        newNetworkingModel.state = NetworkingState.ANNOUNCED.getRepresentNum();
        boolean result = networkingDAO.insertOne(new Networking(newNetworkingModel));
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    public ResultMsg tempSaveNetworking(NetworkingModel newNetworkingModel) {
        newNetworkingModel.state = NetworkingState.UNANNOUNCED.getRepresentNum();
        boolean result = networkingDAO.insertOne(new Networking(newNetworkingModel));
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    // TODO Charles--等确定了再写
    public List<NetworkingGeneralModel> search(SearchStrategy searchStrategy, SortStrategy sortStrategy) {
        return null;
    }

    // TODO Charles——对数据库的链接形式不清，是直接修改responsor那张表？
    public ResultMsg respond(int myGroupNum) {
        return null;
    }

    // TODO Charles——不清楚responsor干啥？
    public List<GroupGeneralModel> getRespongdingGroup(int networkingID) throws NotExistException {
        List<Responsor> result = responsorDAO.findByProperty("networkingID", networkingID);

        return null;
    }

    public List<NetworkingGeneralModel> getNetworkingSpecial(String groupID, NetworkingState networkingState) throws NotExistException {
        List<Networking> findingResult = networkingDAO.findByProperty("groupID", groupID);
        for (Networking thisNetworkingGModel: findingResult) {
            if (thisNetworkingGModel.getState() != networkingState.getRepresentNum()) {
                findingResult.remove(thisNetworkingGModel);
            }
        }
        return convertListPo2GeneralModel(findingResult);
    }

    public ResultMsg checkGroup(int groupID) {
        return null;
    }

    private List<NetworkingGeneralModel> convertListPo2GeneralModel(List<Networking> thisNetworkingList) {
        List<NetworkingGeneralModel> result = new LinkedList<NetworkingGeneralModel>();
        for (Networking thisNetworking: thisNetworkingList) {
            result.add(new NetworkingGeneralModel(thisNetworking));
        }
        return result;
    }
}
