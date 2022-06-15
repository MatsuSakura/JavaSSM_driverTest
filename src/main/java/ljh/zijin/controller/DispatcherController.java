package ljh.zijin.controller;

import ljh.zijin.pojo.Question;
import ljh.zijin.pojo.User;
import ljh.zijin.service.QuestionService;
import ljh.zijin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class DispatcherController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/changePwd.action", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String changePwd(HttpSession session, String oldPwd, String newPwd){
        //上来就可以判断旧密码是否正确了
        User user = (User) session.getAttribute("loginUser");
        String result = "";
        if(user.getPassword().equals(oldPwd)){
            userService.changePwd(user, newPwd);
            result = "ok";
        }else {
            result = "原密码输入错误，请修改后再试！";
        }
        return result; //在多个分支中分别生成结果，在最后一次性返回
    }
    @RequestMapping("/checkOut.action")
    public String checkOut(HttpSession session){
        //移除保存在session中的登录信息
        session.removeAttribute("loginUser");
        //然后跳转到登录页面
        return "login";
    }
    @RequestMapping(value = "/examAddOrModify",produces = "text/html;charset=utf-8")
    public String toAddOrModify(Integer id,Integer pageNo,Model model){
        model.addAttribute("id",id);
        model.addAttribute("pageNo",pageNo);
        return "examAddOrModify";
    }
    @RequestMapping(value = "/examDetail",produces = "text/html;charset=utf-8")
    public String toDetail(Integer id,Integer pageNo,Model model){
        Question question=questionService.getQuestionById(id);
        model.addAttribute("question",question);
        String q_cur="";
        switch (question.getQ_cur()){
            case 1:q_cur="A";
                break;
            case 2:q_cur="B";
                break;
            case 3:q_cur="C";
                break;
            case 4:q_cur="D";
                break;
        }
        model.addAttribute("q_cur",q_cur);
        model.addAttribute("pageNo",pageNo);
        return "examDetail";
    }

    @RequestMapping("/exam")
    public String toIndex(){
        return "exam";
    }
    @RequestMapping("/welcome")
    public String towelcome(){return "welcome";}
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping(value = "/examHistory",produces = "text/html;charset=utf-8")
    public String toExamHistory(){
        return "examHistory";
    }
    @RequestMapping(value = "/changePwd",produces = "text/html;charset=utf-8")
    public String toChangePwd(){
        return "changePwd";
    }
    @RequestMapping(value = "/examManager",produces = "text/html;charset=utf-8")
    public String toExamManager(Integer pageNo, Model model){
        model.addAttribute("pageNo", pageNo);
        return "examManager";
    }
    @RequestMapping("/regist")
    public String toRegist(){
        return "regist";
    }
    @RequestMapping("/admin")
    public String toAdmin(HttpSession session){
        if(session.getAttribute("loginUser")==null){
            return "login";
        }
        return "admin";
    }
}
