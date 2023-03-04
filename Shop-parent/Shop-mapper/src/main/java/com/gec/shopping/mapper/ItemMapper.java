package com.gec.shopping.mapper;

import com.gec.shopping.pojo.Item;
import com.gec.shopping.pojo.TbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    long countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(TbItemExample example);

    Item selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}