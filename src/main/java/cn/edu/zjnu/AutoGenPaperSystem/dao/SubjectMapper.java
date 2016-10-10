package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectMapper {
    int deleteByPrimaryKey(Integer subjectId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer subjectId);

    //Subject selectBysubjectname(String subjectname);


    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);

    List<Subject> selectAllSubject();

    List<Subject> selectByGradeId(int id);
}