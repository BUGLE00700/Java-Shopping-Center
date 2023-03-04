package com.gec.shopping.mapper;

import com.gec.shopping.pojo.Specification;
import com.gec.shopping.pojo.TbSpecificationExample;
import java.util.List;

import com.gec.shopping.vo.SelectOption;
import org.apache.ibatis.annotations.Param;

public interface SpecificationMapper {
    long countByExample(TbSpecificationExample example);

    int deleteByExample(TbSpecificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Specification record);

    int insertSelective(Specification record);

    List<Specification> selectByExample(TbSpecificationExample example);

    Specification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Specification record, @Param("example") TbSpecificationExample example);

    int updateByExample(@Param("record") Specification record, @Param("example") TbSpecificationExample example);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);

    List<SelectOption> selectOptionList();

}