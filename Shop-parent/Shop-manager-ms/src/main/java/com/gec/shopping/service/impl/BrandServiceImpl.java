package com.gec.shopping.service.impl;

//import com.gec.shopping.entity.PageResult;
import com.gec.shopping.mapper.BrandMapper;
import com.gec.shopping.pojo.Brand;
import com.gec.shopping.service.BrandService;
import com.gec.shopping.vo.SelectOption;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

//    @Override
//    public PageResult findPage(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        Page<Brand> page=(Page<Brand>) brandMapper.selectByExample(null);
//        return new PageResult(page.getTotal(),page.getResult());
//    }

    //查询所有Brand的商品
    @Override
    public List<Brand> queryBrand() {
        return brandMapper.selectByExample(null);
    }

    //根据Brand的id查询实体
    @Override
    public Brand findBrandById(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    //添加Brand的商品
    @Override
    public void addBrand(Brand brand) {
        brandMapper.insert(brand);
    }

    //修改Brand的商品
    @Override
    public void updateBrand(Brand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    //删除Brand的商品
    @Override
    public void deleteBrand(Long[] ids) {
        for (Long id : ids) {
            brandMapper.deleteByPrimaryKey(id);
        }
    }
    //返回下拉列表数据

    @Override
    public List<SelectOption> selectOptionList() {
        return brandMapper.selectOptionList();
    }

}
