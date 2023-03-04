package com.gec.shopping.mapper;

import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.TbBrandExample;
import java.util.List;

import com.gec.shopping.vo.SelectOption;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    long countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(TbBrandExample example);

    Brand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    List<SelectOption> selectOptionList();

}