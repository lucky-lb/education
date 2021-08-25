package team.xht.education.dao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.xht.education.entity.EduSubject;
import team.xht.education.entity.EduSubjectExample;

import java.util.List;
@Repository
public interface EduSubjectMapper {
    long countByExample(EduSubjectExample example);

    int deleteByExample(EduSubjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduSubject record);

    int insertSelective(EduSubject record);

    List<EduSubject> selectByExample(EduSubjectExample example);

    EduSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduSubject record, @Param("example") EduSubjectExample example);

    int updateByExample(@Param("record") EduSubject record, @Param("example") EduSubjectExample example);

    int updateByPrimaryKeySelective(EduSubject record);

    int updateByPrimaryKey(EduSubject record);
}