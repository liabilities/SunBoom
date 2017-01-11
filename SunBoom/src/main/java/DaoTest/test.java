package DaoTest;

import DaoImpl.UserDaoImpl;
import POJO.User;

/**
 * Created by mm on 2016/7/11.
 */
public class test {
    public static void main(String[] args) {
        UserDaoImpl userDao=new UserDaoImpl();
        User user=new User();
        user.setId("ruochao");
        user.setPassword("123");
        user.setAddress("hello");
        user.setUserLogin("online");
        user.setUserState("add");
        user.setChecklistPath("cshld");
//        user.setPower(Power.PUBLIC);
        userDao.addUser(user);


//        SummaryDaoImpl summaryDao=new SummaryDaoImpl();
//        Summary summary=new Summary();
//        summary.setId(123);
//        summary.setCombination("jdjaj");
//        summary.setDescription("222");
//        summary.setLocation("chaofatchao");
//        summary.setProjectId("123");
//        summary.setType("shuai");
//        List list=summaryDao.findSummary("23");
//        Summary summary1=(Summary)list.get(0);
//        System.out.println(list.size());

//        ProjectDaoImpl projectDao=new ProjectDaoImpl();
//        Project project=new Project();
//        project.setAttendReview("dd3");
//        project.setCodePath("123");
//        project.setDescription("22");
//        project.setEndTime("22");
//        project.setId("dd3");
//        project.setName("222");
//        project.setPower("ccc");
//        project.setProjectState("aaa");
//        project.setQualityReview("bbbb");
//        project.setStartTime("wwww");
//        project.setType("kdfk");
//        project.setUserId("123");
//        projectDao.deleteProject("dd3");
//        Project project1= (Project) projectDao.findProjectByUserId("fatchao").get(0);
//        System.out.print(project1.getAttendReview()+ "    "+projectDao.findProjectByUserId("fatchao"));


//        PersonalreviewDaoImpl personalreviewDao=new PersonalreviewDaoImpl();
//        Personalreview personalreview=new Personalreview();
//        personalreview.setCommitTime("2014");
//        personalreview.setDescription("no");
//        personalreview.setId(132);
//        personalreview.setLocation("none");
//        personalreview.setProjectId("22222");
//        personalreview.setResult("none");
//        personalreview.setState("none");
//        personalreview.setType("fat");
//        personalreview.setUserId("shachao");
//        Project project=new Project();
//        project.setId("22222");
//        User user=new User();
//        user.setId("shchao");
//        personalreviewDao.addPersionalreview(personalreview);
//        System.out.println(personalreviewDao.updatePersonalreview(personalreview));
//        System.out.println(personalreviewDao.findProject(user.getId(),project.getId()));
//        CreateIdDaoImpl createIdDao=new CreateIdDaoImpl();
//        System.out.print(createIdDao.CreateIntId("Project"));


//        UserDaoImpl userDao=new UserDaoImpl();
//        List list=userDao.getAllUserId();
//        for (Object object:list ) {
//            System.out.println((String)object);
//        }

//        SummaryDaoImpl summaryDao = new SummaryDaoImpl();
//        CreateIdDaoImpl createIdDao = new CreateIdDaoImpl();
//        Summary summary = new Summary();
//        int id=createIdDao.CreateIntId("Summary");
//        summary.setCombination("123");
//        summary.setDescription("222");
//        summary.setFlag(22);
//        summary.setId(id);
//        summary.setLocation("dfsd");
//        summary.setProjectId(12);
//        summary.setType("shachao");
//        summaryDao.addSummary(summary);

//        summary.setProjectId(16);
//        summary.setFlag(22);
//        System.out.println(summaryDao.updateFlag(summary));

//        List list = summaryDao.getValidSummary(summary);
//        for (Object object : list
//                ) {
//            Summary po = (Summary) object;
//            System.out.println(po.getId());
//        }
//        System.out.println(summaryDao.deleteInvalidSummary(summary));

//        MessageDaoImpl messageDao=new MessageDaoImpl();
//        Message message=new Message();
//        message.setId(1);
//        message.setState("123");
//        System.out.println(messageDao.updateMessageState(message));

        System.out.print("dd");
    }
}
