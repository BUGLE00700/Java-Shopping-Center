package com.gec.shopping.service;

import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.TypeTemplate;

import java.util.List;

public interface TypeTemplateService {
    //返回分页列表
//    public PageResult findPage(int pageNum,int pageSize);
    //查询所有TypeTemplate的商品
    public List<TypeTemplate> queryTypeTemplate();
    //根据TypeTemplate的id查询实体
    public TypeTemplate findTypeTemplateById(Long id);
    //添加TypeTemplate的商品
    public void addTypeTemplate(TypeTemplate typeTemplate);
    //修改TypeTemplate的商品
    public void updateTypeTemplate(TypeTemplate typeTemplate);
    //删除TypeTemplate的商品
    public void deleteTypeTemplate(Long[] ids);
    //返回下拉列表数据
//    public List<Map> selectOptionList();
}
