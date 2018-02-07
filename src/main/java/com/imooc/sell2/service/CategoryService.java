package com.imooc.sell2.service;

import com.imooc.sell2.dataobject.ProductCategory;

import java.util.List;

/**
 * @author hushangkun
 * @date 2018/2/7 2:30
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
