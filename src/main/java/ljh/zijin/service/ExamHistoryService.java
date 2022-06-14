package ljh.zijin.service;

import ljh.zijin.pojo.ExamHistory;

import java.util.List;

public interface ExamHistoryService {
    void addExamHistory(Integer userId,Integer score);
    List<ExamHistory> getExamHistoryByUser(Integer userId);
}
