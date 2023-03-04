package com.gec.shopping.mapper;

import com.gec.shopping.pojo.Content;
import com.gec.shopping.pojo.TbContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
    long countByExample(TbContentExample example);

    int deleteByExample(TbContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Content record);

    int insertSelective(Content record);

    List<Content> selectByExample(TbContentExample example);

    Content selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Content record, @Param("example") TbContentExample example);

    int updateByExample(@Param("record") Content record, @Param("example") TbContentExample example);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}