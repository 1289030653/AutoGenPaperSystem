package cn.edu.zjnu.AutoGenPaperSystem.service;

import cn.edu.zjnu.AutoGenPaperSystem.model.Charaction;

/**
 * Created by zseapeng on 2016/9/22.
 */
public interface CharacterService {
    int deleteByPrimaryKey(Integer charactId);

    int insert(Charaction record);

    int insertSelective(Charaction record);

    Charaction selectByPrimaryKey(Integer charactId);

    int updateByPrimaryKeySelective(Charaction record);

    int updateByPrimaryKey(Charaction record);
}
