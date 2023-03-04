package com.gec.shopping.vo;

import com.gec.shopping.pojo.Specification;
import com.gec.shopping.pojo.SpecificationOption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecificationOpt {
    private Specification specification;
    private List<SpecificationOption> specificationOptionList;
}
