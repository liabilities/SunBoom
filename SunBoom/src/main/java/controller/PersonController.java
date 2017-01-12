package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.PersonService;
import serviceImpl.PersonServiceImpl;

/**
 * Created by zs on 2016/7/13.
 */
@Controller
public class PersonController {

    @RequestMapping(value = "/mail")
    public ModelAndView getUser(String id){
        PersonService userService = new PersonServiceImpl();
        String mail=userService.getMail(id);
        if(mail==null)
            System.out.print("null");
        ModelAndView model=new ModelAndView("index");
        model.addObject("mail",mail);
        return model;
    }

}
