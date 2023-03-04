package com.gec.shopping.service;

import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.ItemCat;

import java.util.List;

public interface ItemCatService {
    //返回分页列表
//    public PageResult findPage(int pageNum,int pageSize);
    //查询所有ItemCat的商品
    public List<ItemCat> queryItemCat(Long parentId);
    //根据ItemCat的id查询实体
    public ItemCat findItemCatById(Long id);
    //添加ItemCat的商品
    public void addItemCat(ItemCat itemCat);
    //修改ItemCat的商品
    public void updateItemCat(ItemCat itemCat);
    //删除ItemCat的商品
    public void deleteItemCat(Long[] ids);
    //返回下拉列表数据
//    public List<Map> selectOptionList();
}
