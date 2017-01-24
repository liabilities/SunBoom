package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.PersonService;
import service.impl.PersonServiceImpl;
import utilities.exceptions.NotExistException;

/**
 * Created by zs on 2016/7/13.
 */
@Controller
public class PersonController {

    @RequestMapping(value = "/mail")
    public ModelAndView getUser(String id){
        PersonService userService = new PersonServiceImpl();
        try{
            String mail=userService.getMail(id);
            ModelAndView model=new ModelAndView("index");
            model.addObject("mail",mail);
            return model;
        }catch(NotExistException e) {
            System.out.print("null");
            return null;
        }
    }
}
