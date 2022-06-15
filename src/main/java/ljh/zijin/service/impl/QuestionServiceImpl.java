package ljh.zijin.service.impl;

import ljh.zijin.dao.QuestionDAO;
import ljh.zijin.pojo.Question;
import ljh.zijin.service.QuestionService;
import ljh.zijin.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDAO questionDAO;

    @Override
    public Pager<Question> getQuestionByPage(Integer pageNo,Integer pageSize){
        Pager<Question> page=new Pager<Question>();
        Integer totalCount=questionDAO.countQuestions();
        page.setPageCount(totalCount,pageSize);
        page.setPageNo(pageNo);
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("startLine",(page.getPageNo()-1)*pageSize);
        params.put("pageSize",pageSize);
        List<Question> datas=questionDAO.selectQuestionByPage(params);
        page.setDatas(datas);
        return page;
    }
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
