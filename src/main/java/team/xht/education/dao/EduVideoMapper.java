package team.xht.education.dao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.xht.education.entity.EduVideo;
import team.xht.education.entity.EduVideoExample;

import java.util.List;
@Repository
public interface EduVideoMapper {
    long countByExample(EduVideoExample example);

    int deleteByExample(EduVideoExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduVideo record);

    int insertSelective(EduVideo record);

    List<EduVideo> selectByExample(EduVideoExample example);

    EduVideo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduVideo record, @Param("example") EduVideoExample example);

    int updateByExample(@Param("record") EduVideo record, @Param("example") EduVideoExample example);

    int updateByPrimaryKeySelective(EduVideo record);

    int updateByPrimaryKey(EduVideo record);
}