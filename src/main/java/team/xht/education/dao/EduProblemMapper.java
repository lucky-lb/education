package team.xht.education.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.xht.education.entity.EduProblem;
import team.xht.education.entity.EduProblemExample;
import team.xht.education.entity.EduProblemWithBLOBs;

import java.util.List;
@Repository
public interface EduProblemMapper {
    long countByExample(EduProblemExample example);

    int deleteByExample(EduProblemExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduProblemWithBLOBs record);

    int insertSelective(EduProblemWithBLOBs record);

    List<EduProblemWithBLOBs> selectByExampleWithBLOBs(EduProblemExample example);

    List<EduProblem> selectByExample(EduProblemExample example);

    EduProblemWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduProblemWithBLOBs record, @Param("example") EduProblemExample example);

    int updateByExampleWithBLOBs(@Param("record") EduProblemWithBLOBs record, @Param("example") EduProblemExample example);

    int updateByExample(@Param("record") EduProblem record, @Param("example") EduProblemExample example);

    int updateByPrimaryKeySelective(EduProblemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EduProblemWithBLOBs record);

    int updateByPrimaryKey(EduProblem record);
}