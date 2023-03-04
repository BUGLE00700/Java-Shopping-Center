package com.gec.shopping.mapper;

import com.gec.shopping.pojo.ContentCategory;
import com.gec.shopping.pojo.TbContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentCategoryMapper {
    long countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentCategory record);

    int insertSelective(ContentCategory record);

    List<ContentCategory> selectByExample(TbContentCategoryExample example);

    ContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByExample(@Param("record") ContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByPrimaryKeySelective(ContentCategory record);

    int updateByPrimaryKey(ContentCategory record);
}