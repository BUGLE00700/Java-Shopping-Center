package com.gec.shopping.controller;

import com.gec.shopping.entity.Result;
import com.gec.shopping.pojo.TypeTemplate;
import com.gec.shopping.service.TypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/typeTemplate-Ms")
public class TypeTemplateController {
    @Autowired
    private TypeTemplateService typeTemplateService;

    //查询所有TypeTemplate的商品
    @GetMapping("/findAll")
    public List<TypeTemplate> queryAllTypeTemplate(){
        List<TypeTemplate> list=typeTemplateService.queryTypeTemplate();
        return list;
    }

//    //根据TypeTemplate的id查询实体
//    @GetMapping("/findAllTypeTemplateById/{id}")
//    public  TypeTemplate findAllTypeTemplateById(@PathVariable Long id){
//        System.out.println(id+"findTypeTemplateById");
//        return typeTemplateService.findTypeTemplateById(id);
//    }

    //根据TypeTemplate的id查询实体
    @RequestMapping("/findOne")
    public TypeTemplate findTypeTemplateDetail(Long id) {
        return typeTemplateService.findTypeTemplateById(id);
    }

    //添加TypeTemplate的商品
    @RequestMapping("/add")
    public Result addTypeTemplateAll(@RequestBody TypeTemplate typeTemplate){
        try {
            System.out.println("tb_TypeTemplate id"+typeTemplate.getId());
            typeTemplateService.addTypeTemplate(typeTemplate);
            return new Result(true,"添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败！");
        }
    }

    //修改TypeTemplate的商品
    @PostMapping("/update")
    public Result updateTypeTemplateAll(@RequestBody TypeTemplate typeTemplate){
        try {
            System.out.println("tb_TypeTemplate id"+typeTemplate.getId());
            typeTemplateService.updateTypeTemplate(typeTemplate);
            return new Result(true,"修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败！");
        }
    }

    //删除TypeTemplate的商品
    @GetMapping("/delete")
    public Result deleteTypeTemplateAll(Long[] ids){
        try {
            typeTemplateService.deleteTypeTemplate(ids);
            return new Result(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败！");
        }
    }
}
