package cn.edu.zjnu.AutoGenPaperSystem.service;

import cn.edu.zjnu.AutoGenPaperSystem.model.Questions;

/**
 * Created by zseapeng on 2016/9/22.
 */
public interface QuestionsService {
    int deleteByPrimaryKey(Integer questionsId);

    int insert(Questions record);

    int insertSelective(Questions record);

    Questions selectByPrimaryKey(Integer questionsId);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
}