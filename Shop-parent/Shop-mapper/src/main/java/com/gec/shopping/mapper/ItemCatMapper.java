package com.gec.shopping.mapper;

import com.gec.shopping.pojo.ItemCat;
import com.gec.shopping.pojo.TbItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemCatMapper {
    long countByExample(TbItemCatExample example);

    int deleteByExample(TbItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemCat record);

    int insertSelective(ItemCat record);

    List<ItemCat> selectByExample(TbItemCatExample example);

    ItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemCat record, @Param("example") TbItemCatExample example);

    int updateByExample(@Param("record") ItemCat record, @Param("example") TbItemCatExample example);

    int updateByPrimaryKeySelective(ItemCat record);

    int updateByPrimaryKey(ItemCat record);

    List<ItemCat> selectAll(@Param("parentId") Long parentId);

}