package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.UcenterMember;
import team.xht.education.entity.UcenterMemberExample;

public interface UcenterMemberMapper {
    long countByExample(UcenterMemberExample example);

    int deleteByExample(UcenterMemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(UcenterMember record);

    int insertSelective(UcenterMember record);

    List<UcenterMember> selectByExample(UcenterMemberExample example);

    UcenterMember selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UcenterMember record, @Param("example") UcenterMemberExample example);

    int updateByExample(@Param("record") UcenterMember record, @Param("example") UcenterMemberExample example);

    int updateByPrimaryKeySelective(UcenterMember record);

    int updateByPrimaryKey(UcenterMember record);
}