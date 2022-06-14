package ljh.zijin.controller;

import ljh.zijin.pojo.User;
import ljh.zijin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/doLogin.action",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login(String username, String password,HttpSession session){
        String result="";
        String adminName="admin";
        try{
            User user=userService.login(username,password);
            session.setAttribute("loginUser",user);
            if(username==adminName){
                result="admin";
            }else{
                result="ok";
            }


        }catch(Exception e){
            e.printStackTrace();
            result=e.getMessage();
        }
        return result;
//        User user=userService.login(username,password);
//        System.out.println(user.getId());
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//        System.out.println("运行完毕");
//        System.out.println(user.getUsername()+"登录成功");
//        System.out.println("从页面接受到的数据");
//        System.out.println("username="+username);
//        System.out.println("password="+password);
//        return "hello";
    }

    @RequestMapping("/checkUsername.action")
    @ResponseBody
    public String checkUsername(String username){
        Boolean flag=userService.checkUsernameExist(username);
        if(flag){
            return "no";
        }else {
            return "ok";
        }
    }

    @RequestMapping("/doRegist.action")
    @ResponseBody
    public String doRegist(String username,String password){
        String result="";
        try{
            userService.regist(username,password);
            result="ok";
        }catch (Exception e){
            e.printStackTrace();
            result=e.getMessage();
        }
        return result;
    }
//    public void setUserService(UserService userService){
//        this.userService=userService;
//    }
}
