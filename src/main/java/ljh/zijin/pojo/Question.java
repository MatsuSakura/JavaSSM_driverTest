package ljh.zijin.pojo;

public class Question {
    private Integer id;
    private String questionBody;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private Integer q_cur;

    public Question() {
    }
    public Question(Integer id, String questionBody, String option1, String option2,
                    String option3, String option4, Integer q_cur) {
        this.id = id;
        this.questionBody = questionBody;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.q_cur = q_cur;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public Integer getQ_cur() {
        return q_cur;
    }

    public void setQ_cur(Integer q_cur) {
        this.q_cur = q_cur;
    }
}
