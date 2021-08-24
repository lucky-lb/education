package team.xht.education.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.xht.education.entity.StatisticsDaily;
import team.xht.education.entity.StatisticsDailyExample;

public interface StatisticsDailyMapper {
    long countByExample(StatisticsDailyExample example);

    int deleteByExample(StatisticsDailyExample example);

    int deleteByPrimaryKey(String id);

    int insert(StatisticsDaily record);

    int insertSelective(StatisticsDaily record);

    List<StatisticsDaily> selectByExample(StatisticsDailyExample example);

    StatisticsDaily selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StatisticsDaily record, @Param("example") StatisticsDailyExample example);

    int updateByExample(@Param("record") StatisticsDaily record, @Param("example") StatisticsDailyExample example);

    int updateByPrimaryKeySelective(StatisticsDaily record);

    int updateByPrimaryKey(StatisticsDaily record);
}