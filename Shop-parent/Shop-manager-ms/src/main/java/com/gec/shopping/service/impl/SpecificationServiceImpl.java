package com.gec.shopping.service.impl;

import com.gec.shopping.mapper.BrandMapper;
import com.gec.shopping.mapper.SpecificationMapper;
import com.gec.shopping.mapper.SpecificationOptionMapper;
import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.Specification;
import com.gec.shopping.pojo.SpecificationOption;
import com.gec.shopping.service.SpecificationService;
import com.gec.shopping.vo.SelectOption;
import com.gec.shopping.vo.SpecificationOpt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;
    @Autowired
    private SpecificationOptionMapper specificationOptionMapper;

//    @Override
//    public PageResult findPage(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        Page<Specification> page=(Page<Specification>) specificationMapper.selectByExample(null);
//        return new PageResult(page.getTotal(),page.getResult());
//    }

    //查询所有Specification的商品
    @Override
    public List<Specification> querySpecification() {
        return specificationMapper.selectByExample(null);
    }

    //根据Specification的id查询实体
    @Override
    public SpecificationOpt findSpecificationById(Long id) {
        Specification specification = specificationMapper.selectByPrimaryKey(id);
        List<SpecificationOption> list = specificationOptionMapper.selectAllBySpecId(id);
        return new SpecificationOpt(specification, !Objects.isNull(list) ? list : new ArrayList<>());
    }

    //添加Specification的商品
    @Override
    public void addSpecification(SpecificationOpt specificationOpt) {

        // 获取规格
        Specification specification = specificationOpt.getSpecification();
        // 获取规格选项
        List<SpecificationOption> list = specificationOpt.getSpecificationOptionList();
//        保存规格
        specificationMapper.insert(specification);
        for (SpecificationOption item : list) {
            item.setSpecId(specification.getId());
            specificationOptionMapper.insert(item);
        }
    }

    //修改Specification的商品
    @Override
    public void updateSpecification(SpecificationOpt specificationOpt) {
        // 获取规格
        Specification specification = specificationOpt.getSpecification();
        // 获取规格选项
        List<SpecificationOption> list = specificationOpt.getSpecificationOptionList();
        specificationMapper.updateByPrimaryKey(specification);

//        移除原有规格选项
        for (SpecificationOption option : list) {
            specificationOptionMapper.deleteByPrimaryKey(option.getId());
        }
//        保存新的规格选项
        for (SpecificationOption item : list) {
            item.setSpecId(specification.getId());
            specificationOptionMapper.insert(item);
        }
    }

    //删除Specification的商品
    @Override
    public void deleteSpecification(Long[] ids) {
        for (Long id : ids) {
            specificationMapper.deleteByPrimaryKey(id);
            specificationOptionMapper.deleteBySpecId(id);
        }
    }

    @Override
    public List<SelectOption> selectOptionList() {
        return specificationMapper.selectOptionList();
    }

}
