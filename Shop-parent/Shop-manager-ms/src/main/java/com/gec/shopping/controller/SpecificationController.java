package com.gec.shopping.controller;

import com.gec.shopping.entity.Result;
import com.gec.shopping.pojo.Specification;
import com.gec.shopping.service.SpecificationService;
import com.gec.shopping.vo.SelectOption;
import com.gec.shopping.vo.SpecificationOpt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specification-Ms")
public class SpecificationController {
    @Autowired
    private SpecificationService specificationService;

    //查询所有Specification的商品
    @GetMapping("/findSpecificationAll")
    public List<Specification> queryAllSpecification() {
        List<Specification> list = specificationService.querySpecification();
        return list;
    }

//    //根据Specification的id查询实体
//    @GetMapping("/findAllSpecificationById/{id}")
//    public  Specification findAllSpecificationById(@PathVariable Long id){
//        System.out.println(id+"findSpecificationById");
//        return specificationService.findSpecificationById(id);
//    }

    //根据Specification的id查询实体
    @GetMapping("/findSpecificationAllOne")
    public SpecificationOpt findSpecificationDetail(Long id) {
        return specificationService.findSpecificationById(id);
    }

    //添加Specification的商品
    @RequestMapping("/addSpecificationAll")
    public Result addSpecificationAll(@RequestBody SpecificationOpt specificationOpt) {
        try {
            specificationService.addSpecification(specificationOpt);
            System.out.println(specificationOpt);
            return new Result(true, "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败！");
        }
    }

    //修改Specification的商品
    @PostMapping("/updateSpecificationAll")
    public Result updateSpecificationAll(@RequestBody SpecificationOpt specificationOpt) {
        try {
            specificationService.updateSpecification(specificationOpt);
            return new Result(true, "修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败！");
        }
    }

    //删除Specification的商品
    @GetMapping("/deleteSpecificationAll")
    public Result deleteSpecificationAll(Long[] ids) {
        try {
            specificationService.deleteSpecification(ids);
            return new Result(true, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败！");
        }
    }

    //返回下拉列表数据
    @RequestMapping("/selectOptionList")
    public List<SelectOption> selectOptionList(){
        return specificationService.selectOptionList();
    }
}
