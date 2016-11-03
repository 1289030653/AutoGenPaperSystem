package cn.edu.zjnu.AutoGenPaperSystem.service;

import cn.edu.zjnu.AutoGenPaperSystem.model.Questions;
import cn.edu.zjnu.AutoGenPaperSystem.model.SearchAll;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by zseapeng on 2016/9/22.
 */
@Repository
public interface QuestionsService {
    int deleteByPrimaryKey(Integer questionsId);

    int insert(Questions record);

    int insertSelective(Questions record);

    Questions selectByPrimaryKey(Integer questionsId);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);

    Map selectBySearchAll(SearchAll searchAll,int nowpage,Integer userId);

    List selectUploadTime();

    Map selectQuestionByTime(int subjectId, String date,int nowpage);

//    List selectQuestionByIdList(Integer userId);
}
