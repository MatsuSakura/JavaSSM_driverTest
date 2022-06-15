package ljh.zijin.dao;

import ljh.zijin.pojo.Question;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface QuestionDAO {
    List<Integer> selectAllIds();
    Question selectQuestionById(Integer id);
    Integer countQuestions();
    List<Question> selectQuestionByPage(Map<String,Object> params);
}
