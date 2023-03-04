package com.gec.shopping.service.impl;

import com.gec.shopping.mapper.BrandMapper;
import com.gec.shopping.mapper.TypeTemplateMapper;
import com.gec.shopping.pojo.Brand;
import com.gec.shopping.pojo.TypeTemplate;
import com.gec.shopping.service.BrandService;
import com.gec.shopping.service.TypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeTemplateServiceImpl implements TypeTemplateService {

    @Autowired
    private TypeTemplateMapper typeTemplateMapper;

//    @Override
//    public PageResult findPage(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        Page<TypeTemplate> page=(Page<TypeTemplate>) typeTemplateMapper.selectByExample(null);
//        return new PageResult(page.getTotal(),page.getResult());
//    }

    //查询所有TypeTemplate的商品
    @Override
    public List<TypeTemplate> queryTypeTemplate() {
        return typeTemplateMapper.selectByExample(null);
    }

    //根据TypeTemplate的id查询实体
    @Override
    public TypeTemplate findTypeTemplateById(Long id) {
        return typeTemplateMapper.selectByPrimaryKey(id);
    }

    //添加TypeTemplate的商品
    @Override
    public void addTypeTemplate(TypeTemplate typeTemplate) {
        typeTemplateMapper.insert(typeTemplate);
    }

    //修改TypeTemplate的商品
    @Override
    public void updateTypeTemplate(TypeTemplate typeTemplate) {
        typeTemplateMapper.updateByPrimaryKey(typeTemplate);
    }

    //删除TypeTemplate的商品
    @Override
    public void deleteTypeTemplate(Long[] ids) {
        for (Long id : ids) {
            typeTemplateMapper.deleteByPrimaryKey(id);
        }
    }

}
