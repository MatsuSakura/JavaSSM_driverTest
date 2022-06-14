package ljh.zijin.service.impl;

import ljh.zijin.dao.ExamHistoryDAO;
import ljh.zijin.pojo.ExamHistory;
import ljh.zijin.service.ExamHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamHistoryServiceImpl implements ExamHistoryService {
    @Autowired
    private ExamHistoryDAO examHistoryDAO;

    @Override
    public void addExamHistory(Integer userId,Integer score){
        ExamHistory examHistory=new ExamHistory();
        examHistory.setUserId(userId);
        examHistory.setScore(score);
        examHistoryDAO.insertExamHistory(examHistory);
    }

    @Override
    public List<ExamHistory> getExamHistoryByUser(Integer userID){
        return examHistoryDAO.selectExamHistoryByUser(userID);
    }
}
