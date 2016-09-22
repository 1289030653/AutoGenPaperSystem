package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMapper {
    int deleteByPrimaryKey(Integer subjectId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer subjectId);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}