package ljh.zijin.pojo;

import java.util.Date;

public class ExamHistory {
    private Integer id;
    private Integer userId;
    private Integer score;
    private Date createTime;

    public ExamHistory() {
    }

    public ExamHistory(Integer id, Integer userId,
                       Integer score, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.score = score;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
