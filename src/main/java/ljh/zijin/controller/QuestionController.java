package ljh.zijin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ljh.zijin.pojo.Question;
import ljh.zijin.service.QuestionService;
import ljh.zijin.util.Pager;
import ljh.zijin.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/getQuestions.action",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuestion(){
        List<Integer> ids=questionService.getQuestionIds();
        ObjectMapper mapper = new ObjectMapper();
        return StringUtil.getJson(ids);
    }

    @RequestMapping(value = "/getQuestionById.action",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuestionById(Integer id){
        Question question=questionService.getQuestionById(id);
        ObjectMapper mapper = new ObjectMapper();
        return StringUtil.getJson(question);
    }
}
