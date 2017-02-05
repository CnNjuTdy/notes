package sp.learn.baobaotao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sp.learn.baobaotao.domain.User;
import sp.learn.baobaotao.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Tondiyee on 2017/1/21.
 */
@Controller
public class LoginController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/index.html")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand){
        boolean isValidUser = service.hasMatchUser(loginCommand.getUserName(),loginCommand.getPassword());
        if(!isValidUser){
            return new ModelAndView("login","error","用户名和密码错误");
        }else {
            User user= service.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(request.getRemoteAddr());
            user.setLastVisit(new Date());
            service.loginSuccess(user);
            request.getSession().setAttribute("user",user);
            return new ModelAndView("main");
        }
    }

}



