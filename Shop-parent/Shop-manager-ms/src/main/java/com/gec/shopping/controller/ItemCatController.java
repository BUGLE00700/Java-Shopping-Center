package com.gec.shopping.controller;

import com.gec.shopping.entity.Result;
import com.gec.shopping.pojo.ItemCat;
import com.gec.shopping.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/itemCat-ms")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    //查询所有ItemCat的商品
    @GetMapping("/findAll")
    public List<ItemCat> queryAllItemCat(){
        List<ItemCat> list=itemCatService.queryItemCat(0L);
        return list;
    }

//    //根据ItemCat的id查询实体
//    @GetMapping("/findAllItemCatById/{id}")
//    public  ItemCat findAllItemCatById(@PathVariable Long id){
//        System.out.println(id+"findItemCatById");
//        return itemCatService.findItemCatById(id);
//    }

    //根据ItemCat的id查询实体
    @RequestMapping("/findOne")
    public ItemCat findItemCatDetail(Long id) {
        return itemCatService.findItemCatById(id);
    }

    //添加ItemCat的商品
    @RequestMapping("/add")
    public Result addItemCatAll(@RequestBody ItemCat itemCat){
        try {
            System.out.println("tb_ItemCat id"+itemCat.getId());
            itemCatService.addItemCat(itemCat);
            return new Result(true,"添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败！");
        }
    }

    //修改ItemCat的商品
    @PostMapping("/update")
    public Result updateItemCatAll(@RequestBody ItemCat itemCat){
        try {
            System.out.println("tb_ItemCat id"+itemCat.getId());
            itemCatService.updateItemCat(itemCat);
            return new Result(true,"修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败！");
        }
    }

    //删除ItemCat的商品
    @GetMapping("/delete")
    public Result deleteItemCatAll(Long[] ids){
        try {
            itemCatService.deleteItemCat(ids);
            return new Result(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败！");
        }
    }

    @GetMapping("/findByParentId")
    public List<ItemCat> queryAllItemCatByParentId(Long parentId){
        List<ItemCat> list=itemCatService.queryItemCat(parentId);
        return list;
    }
}

