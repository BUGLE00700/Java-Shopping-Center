package com.gec.shopping.mapper;

import com.gec.shopping.pojo.TypeTemplate;
import com.gec.shopping.pojo.TbTypeTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeTemplateMapper {
    long countByExample(TbTypeTemplateExample example);

    int deleteByExample(TbTypeTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TypeTemplate record);

    int insertSelective(TypeTemplate record);

    List<TypeTemplate> selectByExample(TbTypeTemplateExample example);

    TypeTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TypeTemplate record, @Param("example") TbTypeTemplateExample example);

    int updateByExample(@Param("record") TypeTemplate record, @Param("example") TbTypeTemplateExample example);

    int updateByPrimaryKeySelective(TypeTemplate record);

    int updateByPrimaryKey(TypeTemplate record);

}