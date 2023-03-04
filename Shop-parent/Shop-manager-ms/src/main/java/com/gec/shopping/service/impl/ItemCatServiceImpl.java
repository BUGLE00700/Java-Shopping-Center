package com.gec.shopping.service.impl;

import com.gec.shopping.mapper.ItemCatMapper;
import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.ItemCat;
import com.gec.shopping.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

//    @Override
//    public PageResult findPage(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        Page<ItemCat> page=(Page<ItemCat>) itemCatMapper.selectByExample(null);
//        return new PageResult(page.getTotal(),page.getResult());
//    }

    //查询所有ItemCat的商品
    @Override
    public List<ItemCat> queryItemCat(Long parentId) {
        return itemCatMapper.selectAll(parentId);
    }

    //根据ItemCat的id查询实体
    @Override
    public ItemCat findItemCatById(Long id) {
        return itemCatMapper.selectByPrimaryKey(id);
    }

    //添加ItemCat的商品
    @Override
    public void addItemCat(ItemCat itemCat) {
        itemCatMapper.insert(itemCat);
    }

    //修改ItemCat的商品
    @Override
    public void updateItemCat(ItemCat itemCat) {
        itemCatMapper.updateByPrimaryKey(itemCat);
    }

    //删除ItemCat的商品
    @Override
    public void deleteItemCat(Long[] ids) {
        for (Long id : ids) {
            itemCatMapper.deleteByPrimaryKey(id);
        }
    }
}

