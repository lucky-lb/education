package team.xht.education.dao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.xht.education.entity.EduTest;
import team.xht.education.entity.EduTestExample;

import java.util.List;
@Repository
public interface EduTestMapper {
    long countByExample(EduTestExample example);

    int deleteByExample(EduTestExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduTest record);

    int insertSelective(EduTest record);

    List<EduTest> selectByExample(EduTestExample example);

    EduTest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduTest record, @Param("example") EduTestExample example);

    int updateByExample(@Param("record") EduTest record, @Param("example") EduTestExample example);

    int updateByPrimaryKeySelective(EduTest record);

    int updateByPrimaryKey(EduTest record);
}