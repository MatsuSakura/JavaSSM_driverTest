package ljh.zijin.dao;

import ljh.zijin.pojo.ExamHistory;

import java.util.List;

public interface ExamHistoryDAO {
    void insertExamHistory(ExamHistory examHistory);
    List<ExamHistory> selectExamHistoryByUser(Integer userId);
}
