package com.gec.shopping.service;

import com.gec.shopping.pojo.Brand;
import com.gec.shopping.vo.SelectOption;

import java.util.List;
import java.util.Map;

/**
 * 品牌 tr_brand 接口
 */
public interface BrandService {

    //返回分页列表
//    public PageResult findPage(int pageNum,int pageSize);
    //查询所有Brand的商品
    public List<Brand> queryBrand();
    //根据Brand的id查询实体
    public Brand findBrandById(Long id);
    //添加Brand的商品
    public void addBrand(Brand brand);
    //修改Brand的商品
    public void updateBrand(Brand brand);
    //删除Brand的商品
    public void deleteBrand(Long[] ids);

    //返回下拉列表数据
    List<SelectOption> selectOptionList();


}
