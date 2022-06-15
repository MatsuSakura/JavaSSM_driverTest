package ljh.zijin.controller;

import ljh.zijin.pojo.Question;
import ljh.zijin.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DispatcherController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/examDetail")
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
    @RequestMapping("/examHistory")
    public String toExamHistory(){
        return "examHistory";
    }
    @RequestMapping("/examManager")
    public String toExamManager(Integer pageNo, Model model){
        model.addAttribute("pageNo", pageNo);
        return "examManager";
    }
    @RequestMapping("/regist")
    public String toRegist(){
        return "regist";
    }
    @RequestMapping("/admin")
    public String toAdmin(){return "admin";}
}
