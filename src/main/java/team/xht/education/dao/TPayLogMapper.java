package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.TPayLog;
import team.xht.education.entity.TPayLogExample;

public interface TPayLogMapper {
    long countByExample(TPayLogExample example);

    int deleteByExample(TPayLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(TPayLog record);

    int insertSelective(TPayLog record);

    List<TPayLog> selectByExampleWithBLOBs(TPayLogExample example);

    List<TPayLog> selectByExample(TPayLogExample example);

    TPayLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TPayLog record, @Param("example") TPayLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TPayLog record, @Param("example") TPayLogExample example);

    int updateByExample(@Param("record") TPayLog record, @Param("example") TPayLogExample example);

    int updateByPrimaryKeySelective(TPayLog record);

    int updateByPrimaryKeyWithBLOBs(TPayLog record);

    int updateByPrimaryKey(TPayLog record);
}