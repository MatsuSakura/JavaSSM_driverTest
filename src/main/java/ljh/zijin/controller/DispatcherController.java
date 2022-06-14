package ljh.zijin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DispatcherController {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/regist")
    public String toRegist(){
        return "regist";
    }
    @RequestMapping("/admin")
    public String toAdmin(){return "admin";}
}
