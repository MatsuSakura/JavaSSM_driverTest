package ljh.zijin.service.impl;

import ljh.zijin.dao.QuestionDAO;
import ljh.zijin.pojo.Question;
import ljh.zijin.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDAO questionDAO;

    @Override
    public Question getQuestionById(Integer id){
        return questionDAO.selectQuestionById(id);
    }
    @Override
    public List<Integer> getQuestionIds(){
        List<Integer> allIds=questionDAO.selectAllIds();
        List<Integer> result=new ArrayList<Integer>();
        Random r=new Random();
        while(result.size()<20){
            int index=r.nextInt(allIds.size());
            int id=allIds.get(index);
            if(result.contains(id)){
                continue;
            }
            result.add(id);
        }
        return result;
    }
}
