package com.gec.shopping.service;

import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.Specification;
import com.gec.shopping.vo.SelectOption;
import com.gec.shopping.vo.SpecificationOpt;

import java.util.List;

public interface SpecificationService {
    //查询所有Specification的商品
    public List<Specification> querySpecification();
    //根据Specification的id查询实体
    public SpecificationOpt findSpecificationById(Long id);
    //添加Specification的商品
    public void addSpecification(SpecificationOpt specificationOpt);
    //修改Specification的商品
    public void updateSpecification(SpecificationOpt specificationOpt);
    //删除Specification的商品
    public void deleteSpecification(Long[] ids);

    List<SelectOption> selectOptionList();
}
