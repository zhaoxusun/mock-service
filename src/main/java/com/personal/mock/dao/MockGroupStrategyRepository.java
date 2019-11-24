package com.personal.mock.dao;

import com.personal.mock.po.MockGroupStrategy;
import com.personal.mock.po.MockGroupStrategyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MockGroupStrategyRepository {
    int countByExample(MockGroupStrategyQuery example);

    int deleteByExample(MockGroupStrategyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockGroupStrategy record);

    int insertSelective(MockGroupStrategy record);

    List<MockGroupStrategy> selectByExample(MockGroupStrategyQuery example);

    MockGroupStrategy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockGroupStrategy record, @Param("example") MockGroupStrategyQuery example);

    int updateByExample(@Param("record") MockGroupStrategy record, @Param("example") MockGroupStrategyQuery example);

    int updateByPrimaryKeySelective(MockGroupStrategy record);

    int updateByPrimaryKey(MockGroupStrategy record);
}