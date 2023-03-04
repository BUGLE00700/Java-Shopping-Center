package com.gec.shopping.controller;

//import com.gec.shopping.entity.PageResult;
import com.gec.shopping.entity.Result;
import com.gec.shopping.pojo.Brand;
import com.gec.shopping.service.BrandService;
import com.gec.shopping.vo.SelectOption;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brand-Ms")
public class BrandController {

    @Autowired
    private BrandService brandService;

    //查询所有Brand的商品
    @GetMapping("/queryAllBrand")
    public List<Brand> queryAllBrand(){
        List<Brand> list=brandService.queryBrand();
        System.out.println(list);
        return list;
    }

//    //根据Brand的id查询实体
//    @GetMapping("/findAllBrandById/{id}")
//    public  Brand findAllBrandById(@PathVariable Long id){
//        System.out.println(id+"findBrandById");
//        return brandService.findBrandById(id);
//    }

    //根据Brand的id查询实体
    @RequestMapping("/findBrandDetail")
    public Brand findBrandDetail(Long id) {
        return brandService.findBrandById(id);
    }

    //添加Brand的商品
    @RequestMapping("/addBrandAll")
    public Result addBrandAll(@RequestBody Brand brand){
        try {
            System.out.println("tb_Brand id"+brand.getId());
            brandService.addBrand(brand);
            return new Result(true,"添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败！");
        }
    }

    //修改Brand的商品
    @PostMapping("/updateBrandAll")
    public Result updateBrandAll(@RequestBody Brand brand){
        try {
            System.out.println("tb_Brand id"+brand.getId());
            brandService.updateBrand(brand);
            return new Result(true,"修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败！");
        }
    }

    //删除Brand的商品
    @GetMapping("/deleteBrandAll")
    public Result deleteBrandAll(Long[] ids){
        try {
            brandService.deleteBrand(ids);
            return new Result(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败！");
        }
    }

    //返回下拉列表数据
    @RequestMapping("/selectOptionList")
    public List<SelectOption> selectOptionList(){
        return brandService.selectOptionList();
    }


//    @GetMapping("/findPage")
//    public PageResult findPage(int pageNum,int pageSize){
//        PageHelper.startPage(pageNum,pageSize);
//        Page<Brand> page= (Page<Brand>) brandService.queryBrand();
//        PageResult pageResult=new PageResult();
//        pageResult.setRows(page.getResult());
//        pageResult.setTotal(page.getTotal());
//        return pageResult;
//    }

//    @RequestMapping("/findPage")
//    public PageResult findPage(int page,int rows){
//        return brandService.findPage(page,rows);
//    }


//    @RequestMapping("/findPage")
//    public PageResult findPage(int pageNum,int pageSize) {
//        return brandService.findPage(pageNum, pageSize);
//    }







}
