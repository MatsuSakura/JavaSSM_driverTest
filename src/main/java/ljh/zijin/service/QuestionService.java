package ljh.zijin.service;

import ljh.zijin.pojo.Question;
import ljh.zijin.util.Pager;

import java.util.List;

public interface QuestionService {
    List<Integer> getQuestionIds();
    Question getQuestionById(Integer id);
    Pager<Question> getQuestionByPage(Integer pageNo,Integer pageSize);
}
