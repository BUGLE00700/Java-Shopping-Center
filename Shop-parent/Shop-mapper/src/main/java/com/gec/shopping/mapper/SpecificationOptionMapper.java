package com.gec.shopping.mapper;

import com.gec.shopping.pojo.SpecificationOption;
import com.gec.shopping.pojo.SpecificationOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationOptionMapper {
    long countByExample(SpecificationOptionExample example);

    int deleteByExample(SpecificationOptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpecificationOption record);

    int insertSelective(SpecificationOption record);

    List<SpecificationOption> selectByExample(SpecificationOptionExample example);

    SpecificationOption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpecificationOption record, @Param("example") SpecificationOptionExample example);

    int updateByExample(@Param("record") SpecificationOption record, @Param("example") SpecificationOptionExample example);

    int updateByPrimaryKeySelective(SpecificationOption record);

    int updateByPrimaryKey(SpecificationOption record);

    int deleteBySpecId(@Param("id") Long id);

    List<SpecificationOption> selectAllBySpecId(@Param("id") Long id);
}