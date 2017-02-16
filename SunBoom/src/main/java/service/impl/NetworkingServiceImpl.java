package service.impl;

import dao.NetworkingDAO;
import model.GroupGeneralModel;
import model.NetworkingGeneralModel;
import model.NetworkingModel;
import pojo.Networking;
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

    public NetworkingServiceImpl(NetworkingDAO networkingDAO) {
        this.networkingDAO = networkingDAO;
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
        return null;
    }

    public ResultMsg tempSaveNetworking(NetworkingModel newNetworkingModel) {
        return null;
    }

    public List<NetworkingGeneralModel> search(SearchStrategy searchStrategy, SortStrategy sortStrategy) {
        return null;
    }

    public ResultMsg respond(int myGroupNum) {
        return null;
    }

    public List<GroupGeneralModel> getRespongdingGroup(int networkingID) {
        return null;
    }

    public List<NetworkingModel> getNetworkingSpecial(String groupID, NetworkingState networkingState) {
        return null;
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
