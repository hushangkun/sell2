package com.imooc.sell2.service.impl;

import com.imooc.sell2.dataobject.ProductCategory;
import com.imooc.sell2.repository.ProductCategoryRepository;
import com.imooc.sell2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目
 * @author hushangkun
 * @date 2018/2/7 2:33
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
