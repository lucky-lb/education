package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.CrmBanner;
import team.xht.education.entity.CrmBannerExample;

public interface CrmBannerMapper {
    long countByExample(CrmBannerExample example);

    int deleteByExample(CrmBannerExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmBanner record);

    int insertSelective(CrmBanner record);

    List<CrmBanner> selectByExample(CrmBannerExample example);

    CrmBanner selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmBanner record, @Param("example") CrmBannerExample example);

    int updateByExample(@Param("record") CrmBanner record, @Param("example") CrmBannerExample example);

    int updateByPrimaryKeySelective(CrmBanner record);

    int updateByPrimaryKey(CrmBanner record);
}