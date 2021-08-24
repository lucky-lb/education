package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.EduComment;
import team.xht.education.entity.EduCommentExample;

public interface EduCommentMapper {
    long countByExample(EduCommentExample example);

    int deleteByExample(EduCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduComment record);

    int insertSelective(EduComment record);

    List<EduComment> selectByExample(EduCommentExample example);

    EduComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduComment record, @Param("example") EduCommentExample example);

    int updateByExample(@Param("record") EduComment record, @Param("example") EduCommentExample example);

    int updateByPrimaryKeySelective(EduComment record);

    int updateByPrimaryKey(EduComment record);
}