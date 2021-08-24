package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.EduCourseCollect;
import team.xht.education.entity.EduCourseCollectExample;

public interface EduCourseCollectMapper {
    long countByExample(EduCourseCollectExample example);

    int deleteByExample(EduCourseCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduCourseCollect record);

    int insertSelective(EduCourseCollect record);

    List<EduCourseCollect> selectByExample(EduCourseCollectExample example);

    EduCourseCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduCourseCollect record, @Param("example") EduCourseCollectExample example);

    int updateByExample(@Param("record") EduCourseCollect record, @Param("example") EduCourseCollectExample example);

    int updateByPrimaryKeySelective(EduCourseCollect record);

    int updateByPrimaryKey(EduCourseCollect record);
}