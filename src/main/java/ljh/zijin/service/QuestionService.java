package ljh.zijin.service;

import ljh.zijin.pojo.Question;

import java.util.List;

public interface QuestionService {
    List<Integer> getQuestionIds();

    Question getQuestionById(Integer id);
}
