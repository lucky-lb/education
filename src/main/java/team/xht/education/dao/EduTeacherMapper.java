package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.EduTeacher;
import team.xht.education.entity.EduTeacherExample;

public interface EduTeacherMapper {
    long countByExample(EduTeacherExample example);

    int deleteByExample(EduTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduTeacher record);

    int insertSelective(EduTeacher record);

    List<EduTeacher> selectByExample(EduTeacherExample example);

    EduTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByExample(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByPrimaryKeySelective(EduTeacher record);

    int updateByPrimaryKey(EduTeacher record);
}