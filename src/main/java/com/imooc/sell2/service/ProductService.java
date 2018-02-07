package com.imooc.sell2.service;

import com.imooc.sell2.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hushangkun
 * @date 2018/2/7 14:25
 */
public interface ProductService {

    /**
     * 根据商品id查询一个商品
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 管理端  涉及到分页，需要传入一个对象Pageable（注意导包）
     * @return
     */
    //List<ProductInfo> findAll(Pageable pageable);   //如果传入Pageable对象，那么返回的是Page对象
    Page<ProductInfo> findAll(Pageable pageable);     //page对象中的信息用到的时候再详解

    /**
     * 新建
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    //加库存
    //减库存




}
