package team.xht.education.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.xht.education.entity.EduChapter;
import team.xht.education.entity.EduChapterExample;

import java.util.List;
@Repository
public interface EduChapterMapper {
    long countByExample(EduChapterExample example);

    int deleteByExample(EduChapterExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduChapter record);

    int insertSelective(EduChapter record);

    List<EduChapter> selectByExample(EduChapterExample example);

    EduChapter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduChapter record, @Param("example") EduChapterExample example);

    int updateByExample(@Param("record") EduChapter record, @Param("example") EduChapterExample example);

    int updateByPrimaryKeySelective(EduChapter record);

    int updateByPrimaryKey(EduChapter record);
}