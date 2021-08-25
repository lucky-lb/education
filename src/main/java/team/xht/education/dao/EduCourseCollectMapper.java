package team.xht.education.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.xht.education.entity.EduCourseCollect;
import team.xht.education.entity.EduCourseCollectExample;

import java.util.List;
@Repository
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