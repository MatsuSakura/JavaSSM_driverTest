package ljh.zijin.dao;

import ljh.zijin.pojo.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO {
    List<Integer> selectAllIds();
    Question selectQuestionById(Integer id);
}
