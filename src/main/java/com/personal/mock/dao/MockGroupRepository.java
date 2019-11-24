package com.personal.mock.dao;

import com.personal.mock.po.MockGroup;
import com.personal.mock.po.MockGroupQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MockGroupRepository {
    int countByExample(MockGroupQuery example);

    int deleteByExample(MockGroupQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockGroup record);

    int insertSelective(MockGroup record);

    List<MockGroup> selectByExample(MockGroupQuery example);

    MockGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockGroup record, @Param("example") MockGroupQuery example);

    int updateByExample(@Param("record") MockGroup record, @Param("example") MockGroupQuery example);

    int updateByPrimaryKeySelective(MockGroup record);

    int updateByPrimaryKey(MockGroup record);
}