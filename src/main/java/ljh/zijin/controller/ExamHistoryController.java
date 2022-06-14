package ljh.zijin.controller;

import ljh.zijin.pojo.ExamHistory;
import ljh.zijin.pojo.User;
import ljh.zijin.service.ExamHistoryService;
import ljh.zijin.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/history")
public class ExamHistoryController {
    @Autowired
    private ExamHistoryService examHistoryService;

    @RequestMapping("/addHistory.action")
    @ResponseBody
    public void addExamHistory(HttpSession session,Integer score){
        User user=(User)session.getAttribute("loginUser");
        Integer userId=user.getId();
        examHistoryService.addExamHistory(userId,score);
    }
    @RequestMapping("/getHistory.action")
    @ResponseBody
    public String getHistory(HttpSession session){
        User user=(User) session.getAttribute("loginUser");
        Integer userId= user.getId();
        List<ExamHistory> histories=
                examHistoryService.getExamHistoryByUser(userId);
        return StringUtil.getJson(histories);
    }
}
