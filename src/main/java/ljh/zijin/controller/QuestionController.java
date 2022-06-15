package ljh.zijin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ljh.zijin.pojo.Question;
import ljh.zijin.service.QuestionService;
import ljh.zijin.util.Pager;
import ljh.zijin.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "getQuestionByPage.action",
            produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuestionByPage(Integer pageNo,Integer pageSize){
        Pager page=questionService.getQuestionByPage(pageNo,pageSize);
        return StringUtil.getJson(page);
    }
    @RequestMapping(value = "/addOrModify.action",produces = "text/html;charset=utf-8" )
    public String addOrModify(Question question, Model model, Integer pageNo){
        questionService.addOrModify(question);
        model.addAttribute("pageNo",pageNo);
        return "examManager";
    }
    @RequestMapping(value = "/removeQuestionById.action")
    @ResponseBody
    public String removeQuestionById(Integer id){
        questionService.removeQuestionById(id);
        return "ok";
    }
    @RequestMapping(value = "/getQuestions.action", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuestion(){
        //获取此次考试的20道题目
        List<Integer> ids = questionService.getQuestionIds();
        //将list转为json格式的字符串返回到页面上
        //使用jackson.jar中提供的映射类实现
        ObjectMapper mapper = new ObjectMapper();
        return StringUtil.getJson(ids); //不是简单的字符串了，是json格式的对象
    }
    @RequestMapping(value = "/getQuestionById.action", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuestionById(Integer id){
        Question question = questionService.getQuestionById(id);
        return StringUtil.getJson(question);
    }

}
