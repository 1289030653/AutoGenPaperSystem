package cn.edu.zjnu.AutoGenPaperSystem.util.generation;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by sgt on 2016/11/28.
 */
public class RuleBean {
    /**
     * 规则id
     */
    private long id;
    /**
     * 试卷期望难度系数
     */
    private double difficulty;
    /**
     * 题目数量
     */
    private int questionNum;
    /**
     * 试卷包含的知识点id
     */
    private List<String> pointIds;
    /**
     * 学科id
     */
    private int subjecId;
    /**
     * 题型id
     */
    private int typeId;
    /**
     * 规则创建时间

     */
    private Timestamp createTime;

    public RuleBean() {
    }

    public RuleBean(long id, double difficulty, int questionNum, List<String> pointIds, int subjecId, int typeId, Timestamp createTime) {
        this.id = id;
        this.difficulty = difficulty;
        this.questionNum = questionNum;
        this.pointIds = pointIds;
        this.subjecId = subjecId;
        this.typeId = typeId;
        this.createTime = createTime;
    }

    public int getSubjecId() {
        return subjecId;
    }

    public void setSubjecId(int subjecId) {
        this.subjecId = subjecId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    public List<String> getPointIds() {
        return pointIds;
    }

    public void setPointIds(List<String> pointIds) {
        this.pointIds = pointIds;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RuleBean{" +
                "id=" + id +
                ", difficulty=" + difficulty +
                ", questionNum=" + questionNum +
                ", pointIds=" + pointIds +
                ", subjecId=" + subjecId +
                ", typeId=" + typeId +
                ", createTime=" + createTime +
                '}';
    }
}
